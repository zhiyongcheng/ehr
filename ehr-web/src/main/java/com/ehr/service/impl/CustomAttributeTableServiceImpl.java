package com.ehr.service.impl;

import com.ehr.dao.CustomAttributeTableDAO;
import com.ehr.model.CustomAttributeTableDO;
import com.ehr.service.CustomAttributeTableService;
import com.ehr.dao.CustomAttributeTableDAO;
import com.ehr.model.CustomAttributeTableDO;
import com.ehr.service.CustomAttributeTableService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class CustomAttributeTableServiceImpl implements CustomAttributeTableService {
    @Autowired
    public CustomAttributeTableDAO dao;

    @Override
    public boolean insert(CustomAttributeTableDO table) {
        try{
            return dao.insert(table) > 0;
        }catch(Exception e){
            log.error("insert CustomAttributeTable error",e);
            return false;
        }
    }

    @Override
    public List<CustomAttributeTableDO> getAttributeTableList(Integer id, Integer siteId, Integer cattId, String changeFlag) {
        Map<String, Object> map = new HashMap();
        if(null != id && id > 0){
            map.put("id", id);
        }
        if(null != siteId){
            map.put("siteId", siteId);
        }
        if(null != cattId){
            map.put("cattId", cattId);
        }
        if(StringUtils.isNoneBlank(changeFlag)){
            map.put("changeFlag",changeFlag);
        }
        return dao.getTableList(map);
    }

    @Override
    public boolean update(CustomAttributeTableDO table) {
        try{
            return dao.update(table) > 0;
        }catch(Exception e){
            log.error("update CustomAttributeTable error",e);
            return false;
        }
    }
}
