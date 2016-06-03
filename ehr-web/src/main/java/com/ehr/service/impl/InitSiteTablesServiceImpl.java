package com.ehr.service.impl;

import com.ehr.dao.*;
import com.ehr.model.*;
import com.ehr.service.InitSiteTablesService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Override
    public boolean initSiteTables(String name,Integer siteId,String status,String sitetype) {
        try{
            //insert site表

            //检查site name 是否重复
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
            }
            if(StringUtils.isNoneBlank(status)){
                site.setStatus(status);
            }
            if(StringUtils.isNoneBlank(sitetype)){
                site.setSiteType(sitetype);
            }
            siteDAO.insert(site);

            //insert CUSTOM_ATTRIBUTE_TABLE_TYPE
            int siteIdNew = site.getId();
            List<CustomAttributeTableTypeDO> listTableType = new ArrayList<>();
            List<EhrSystemInfoType> listEhrSystemInfoType = new ArrayList<>();
            for(EhrSystemInfoType type:listEhrSystemInfoType){
                CustomAttributeTableTypeDO tableType = new CustomAttributeTableTypeDO();
                tableType.setSiteId(siteIdNew);
                tableType.setName(type.getTypeName());
                tableType.setCattCode(type.getTypeCode());
                tableType.setNameEn(type.getTypeNameEn());
                tableType.combineTablePreName();
                listTableType.add(tableType);
            }
            tableTypeDAO.batchInsert(listTableType);

            //insert custom_attribute_table
            Map<String,List<EhrSystemInfoSubType>> map = new HashMap<>();
            List<CustomAttributeTableDO> listTable = new ArrayList<>();
            for(CustomAttributeTableTypeDO tableTypeDO:listTableType){
                String cattCode = tableTypeDO.getCattCode();
                if(map.containsKey(cattCode)){
                    int i = 1;
                    for(EhrSystemInfoSubType subType:map.get(tableTypeDO.getCattCode())){
                        CustomAttributeTableDO tableDO = new CustomAttributeTableDO();
                        tableDO.setSiteId(siteIdNew);
                        tableDO.setCattCode(cattCode);
                        tableDO.setName(subType.getSubTypeName());
                        tableDO.setNameEn(subType.getSubTypeNameEn());
                        tableDO.setCattId(tableTypeDO.getId());
                        tableDO.setChangeflag();
                        tableDO.setIsSystemDefault("Y");
                        tableDO.setAttributeTableName(new StringBuffer(cattCode)
                                .append("_INFO_")
                                .append(siteIdNew).append("_")
                                .append(subType.getSubTypeCode()).toString());
                        tableDO.setDisplayOrder(i);
                        i++;
                        listTable.add(tableDO);
                    }
                }

            }
            tableDAO.batchInsert(listTable);

            //insert table column
            Map<String,List<CustomAttributeTableColumnDO>> mapColumn = new HashMap<>();
            List<CustomAttributeTableColumnDO> listColumn = new ArrayList<>();
            for(CustomAttributeTableDO tableDO:listTable){
                String tableSuffixes = tableDO.getAttributeTableName().split("_")[3];
                if(mapColumn.containsKey(tableSuffixes)){
                    int i = 1;
                    for(CustomAttributeTableColumnDO columnDO:mapColumn.get(tableSuffixes)){
                        columnDO.setSiteId(siteIdNew);
                        columnDO.setDisplayOrder(i);
                        columnDO.setCattId(tableDO.getCattId());
                        columnDO.setCatId(tableDO.getId());
                        columnDO.setCatName(tableDO.getAttributeTableName());
                        columnDO.setColumnName(tableDO.getAttributeTableName()+"_"+i);
                        i++;
                        listColumn.add(columnDO);
                    }
                }
            }
            columnDAO.batchInsert(listColumn);

        }catch (Exception e){
            log.error("init site tables error,{}",e);
            return false;
        }


        return true;
    }


}
