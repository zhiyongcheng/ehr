package com.ehr.service.impl;

import com.ehr.dao.CustomAttributeTableColumnDAO;
import com.ehr.dao.CustomAttributeTableColumnDAO;
import com.ehr.model.CustomAttributeTableColumnDO;
import com.ehr.service.CustomAttributeTableColumnService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@Service
public class CustomAttributeTableColumnServiceImpl implements CustomAttributeTableColumnService {
    @Autowired
    CustomAttributeTableColumnDAO dao;

    @Override
    public boolean insert(CustomAttributeTableColumnDO column) {
        try{
            return dao.insert(column) > 0;
        }catch(Exception e){
            log.error("insert CustomAttributeTableColumn error",e);
            return false;
        }
    }

    @Override
    public List<CustomAttributeTableColumnDO> getAttributeTableColumnList(Integer id, Integer siteId,
                                                                          Integer catId, String catName,
                                                                          Integer columnType, String isRequired) {
        Map<String, Object> map = new HashMap();
        if(null != id && id > 0){
            map.put("id", id);
        }
        if(null != siteId){
            map.put("siteId", siteId);
        }
        if(null != catId){
            map.put("catId", catId);
        }
        if(StringUtils.isNoneBlank(catName)){
            map.put("catName",catName);
        }
        if(null != columnType){
            map.put("columnType", columnType);
        }
        if(StringUtils.isNoneBlank(isRequired)){
            map.put("isRequired",isRequired);
        }
        return dao.getTableColumnList(map);
    }

    @Override
    public boolean update(CustomAttributeTableColumnDO column) {
        try{
            return dao.update(column) > 0;
        }catch(Exception e){
            log.error("update CustomAttributeTableColumn error",e);
            return false;
        }
    }

}
