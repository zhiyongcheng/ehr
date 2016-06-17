package com.ehr.service.impl;

import com.ehr.common.enums.ColumTypeEnum;
import com.ehr.dao.CustomAttributeTableTypeDAO;
import com.ehr.dao.SiteDAO;
import com.ehr.dao.CustomAttributeTableDAO;
import com.ehr.dao.CustomAttributeTableColumnDAO;
import com.ehr.dao.SystemInitDefaultColumnDAO;
import com.ehr.model.*;
import com.ehr.service.SystemInitInfoService;
import com.ehr.service.InitSiteTablesService;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chengzy on 2016/6/12.
 */
@Slf4j
@Service
public class InitSiteTablesServiceImpl implements InitSiteTablesService {
    @Autowired
    SiteDAO siteDAO;
    @Autowired
    CustomAttributeTableTypeDAO tableTypeDAO;
    @Autowired
    CustomAttributeTableDAO tableDAO;
    @Autowired
    CustomAttributeTableColumnDAO columnDAO;
    @Autowired
    SystemInitInfoService systemInitInfoService;
    @Autowired
    SystemInitDefaultColumnDAO defaultColumnDAO;

    @Override
    public boolean initSiteTables(String name,Integer siteId,String status,String sitetype) {
        try{
            //insert site表
System.out.println("###################### init sit ##################");
            //检查site name 是否重复
            if(StringUtils.isBlank(name)){
                return false;
            }
            Map<String,Object> mapParam = new HashMap<>();
            mapParam.put("name",name);
            List<SiteDO> list = siteDAO.getSiteList(mapParam);
            if(list.size() > 0){
                return false;
            }
            SiteDO site = new SiteDO();
            if(StringUtils.isNoneBlank(name)){
                site.setName(name);
            }
            if(null != siteId && siteId > 0){
                site.setParentId(siteId);
            }else{
            	site.setParentId(0);
            }

            if(StringUtils.isNoneBlank(status)){
                site.setStatus(status);
            }else{
                site.setStatus("Y");
            }
            if(StringUtils.isNoneBlank(sitetype)){
                site.setSiteType(sitetype);
            }else{
                site.setSiteType("C");
            }
            site.setCreatedBy(1);
            site.setLastUpdatedBy(1);
            siteDAO.insert(site);

            //insert CUSTOM_ATTRIBUTE_TABLE_TYPE
            int siteIdNew = site.getId();
            List<CustomAttributeTableTypeDO> listTableType = new ArrayList<>();
            List<SystemInitInfoDO> listSystemInitInfoDO = systemInitInfoService.getAllRootSystemInitInfoList();
            for(SystemInitInfoDO type:listSystemInitInfoDO){
                CustomAttributeTableTypeDO tableType = new CustomAttributeTableTypeDO();
                tableType.setSiteId(siteIdNew);
                tableType.setName(type.getTypeName());
                tableType.setCattCode(type.getTypeCode());
                tableType.setNameEn(type.getTypeNameEn());
                tableType.combineTablePreName();
                listTableType.add(tableType);
            }
            tableTypeDAO.batchInsert(listTableType);

            ////查询该站点下所有子集(ORG EMP POST)
            Map<String,Object> map = new HashMap<>();
            map.put("siteId",siteIdNew);
            listTableType = tableTypeDAO.getTableTypeList(map);
            //insert custom_attribute_table
            //查询初始化信息表中 所有子集库表信息
            List<SystemInitInfoDO> listSub = systemInitInfoService.getAllSubSystemInitInfoList();
            List<CustomAttributeTableDO> listTable = new ArrayList<>();
            for(CustomAttributeTableTypeDO tableTypeDO:listTableType){
                String cattCode = tableTypeDO.getCattCode();
                    int i = 1;
                    for(SystemInitInfoDO subType:listSub){
                        //将对应子集下的表中设置 对应的tableTypeId cattCode 等信息
                        if(cattCode.equals(subType.getParentTypeCode())){
                            CustomAttributeTableDO tableDO = new CustomAttributeTableDO();
                            tableDO.setSiteId(siteIdNew);
                            tableDO.setCattCode(cattCode);
                            tableDO.setName(subType.getTypeName());
                            tableDO.setNameEn(subType.getTypeNameEn());
                            tableDO.setCattId(tableTypeDO.getId());
                            tableDO.setChangeFlag("0");
                            tableDO.setIsSystemDefault("Y");
                            tableDO.setAttributeTableName(new StringBuffer(cattCode)
                                    .append("_INFO_")
                                    .append(siteIdNew).append("_")
                                    .append(subType.getTypeCode()).toString());
                            tableDO.setDisplayOrder(i);

                            //tableDO.setSubSysInitSinfoId(subType.getId());
                            i++;
                            listTable.add(tableDO);
                        }
                    }

            }
            tableDAO.batchInsert(listTable);
             //查询该站点下所有表
            Map<String,Object> mapTable = new HashMap<>();
            mapTable.put("siteId",siteIdNew);
            listTable = tableDAO.getTableList(mapTable);
            //insert table column
            //Map<String,List<CustomAttributeTableColumnDO>> mapColumn = new HashMap<>();
            List<CustomAttributeTableColumnDO> defaultColumnList = defaultColumnDAO.getDefaultTableAndColumnList();
            for(CustomAttributeTableDO tableDO:listTable){
                String cattCode = tableDO.getCattCode();
                String tableCode = tableDO.getAttributeTableName().split("_")[3];
                int i = 1;
                for(CustomAttributeTableColumnDO defaultColumn:defaultColumnList){
                    if(defaultColumn.getParentTypeCode().equals(cattCode) && tableCode.equals(defaultColumn.getTypeCode())){
                        defaultColumn.setSiteId(siteIdNew);
                        defaultColumn.setDisplayOrder(i);
                        defaultColumn.setCatId(tableDO.getId());
                        defaultColumn.setCatName(tableDO.getAttributeTableName());
                        //defaultColumn.setColumnName(tableDO.getAttributeTableName()+"_"+i);
                        i++;
                    }
                }
            }
            columnDAO.batchInsert(defaultColumnList);
            //新建表
            List<String> createSqlList = generateCreateSql(listTable,defaultColumnList);
            if(createSqlList.size()==0){
                return false;
            }
            for(String createSql:createSqlList){
                Map<String,Object> sqlMap = new HashMap<>();
                sqlMap.put("createSql",createSql);
                siteDAO.createTables(sqlMap);
            }
        }catch (Exception e){
            log.error("init site tables error,{}",e);
            System.out.println(e);
            return false;
        }

        return true;
    }

    /**
     * 拼装建表语句
     * @param columnDOs
     * @return
     */
    public List<String> generateCreateSql(List<CustomAttributeTableDO> listTable,List<CustomAttributeTableColumnDO> columnDOs){
        List<String> sqlList = new ArrayList<>();
        for(CustomAttributeTableDO table:listTable){
            StringBuffer sql = new StringBuffer();
            String tableName = table.getAttributeTableName();
            sql.append("CREATE TABLE ").append(tableName)
               .append("(id int(11) NOT NULL AUTO_INCREMENT,");
            for(CustomAttributeTableColumnDO columnDO:columnDOs){
                if(tableName.equals(columnDO.getCatName())){
                    ColumTypeEnum columTypeEnum =  ColumTypeEnum.codeOf(columnDO.getColumnType());
                    if(columTypeEnum==null){
                        return new ArrayList<String>();
                    }
                    sql.append(columnDO.getColumnName()).append(" ")
                            .append(columTypeEnum.getColumType());
                    //字段的长度 小数保留位数
                    if(columnDO.getColumnLength()==0){
                        sql.append(columTypeEnum.getDefaultLength());
                    }else {
                        sql.append("(");
                        if(columTypeEnum == ColumTypeEnum.NUMBER){
                            sql.append(columnDO.getColumnLength())
                                    .append(",").append(columnDO.getDecimalPlaces());
                        }else {
                            sql.append(columnDO.getColumnLength());
                        }
                        sql.append(") ");
                    }
                    //是否允许为空
                    if(columnDO.getIsRequired().equals("Y")){
                        sql.append(columTypeEnum.getDefaultValue());
                    }
                    sql.append(",");
                }
            }
            sql.append(" PRIMARY KEY (`id`)").append(")")
                    .append("ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;");
            sqlList.add(sql.toString());

        }


        return sqlList;
    }

}
