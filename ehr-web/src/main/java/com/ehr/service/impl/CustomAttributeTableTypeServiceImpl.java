package com.ehr.service.impl;

import com.ehr.dao.CustomAttributeTableTypeDAO;
import com.ehr.model.CustomAttributeTableTypeDO;
import com.ehr.service.CustomAttributeTableTypeService;
import com.ehr.dao.CustomAttributeTableTypeDAO;
import com.ehr.model.CustomAttributeTableTypeDO;
import com.ehr.service.CustomAttributeTableTypeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class CustomAttributeTableTypeServiceImpl implements CustomAttributeTableTypeService {

    @Autowired
    CustomAttributeTableTypeDAO dao;

    @Override
    public boolean insert(CustomAttributeTableTypeDO tableType) {
        try{
            return dao.insert(tableType) > 0;
        }catch(Exception e){
            log.error("insert CustomAttributeTableType error",e);
            return false;
        }
    }

    @Override
    public List<CustomAttributeTableTypeDO> getAttributeTableTypeList(Integer id, Integer siteId, String cattCode) {
        Map<String, Object> map = new HashMap();
        if(null != id && id > 0){
            map.put("id", id);
        }
        if(null != siteId){
            map.put("siteId", siteId);
        }
        if(StringUtils.isNoneBlank(cattCode)){
            map.put("cattCode",cattCode);
        }
        return dao.getTableTypeList(map);
    }

    @Override
    public boolean update(CustomAttributeTableTypeDO tableType) {
        try{
            return dao.update(tableType) > 0;
        }catch(Exception e){
            log.error("update CustomAttributeTableType error",e);
            return false;
        }
    }
}
