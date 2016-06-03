package com.ehr.service.impl;

import com.ehr.dao.CustomAttributeCodeDAO;
import com.ehr.model.CustomAttributeCodeDO;
import com.ehr.service.CustomAttributeCodeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class CustomAttributeCodeServiceImpl implements CustomAttributeCodeService {
   @Autowired
    public CustomAttributeCodeDAO dao;
    @Override
    public boolean insert(CustomAttributeCodeDO code) {
        try{
            return dao.insert(code) > 0;
        }catch(Exception e){
            log.error("insert CustomAttributeCode error",e);
            return false;
        }
    }

    @Override
    public List<CustomAttributeCodeDO> getAttributeCodeList(Integer id, Integer siteId, String isShow, String isGeneral) {
        Map<String, Object> map = new HashMap();
        if(null != id && id > 0){
            map.put("id", id);
        }
        if(null != siteId){
            map.put("siteId", siteId);
        }
        if(StringUtils.isNoneBlank(isShow)){
            map.put("isShow",isShow);
        }
        if(StringUtils.isNoneBlank(isGeneral)){
            map.put("isGeneral",isGeneral);
        }
        return dao.getAttributeCodeList(map);
    }

    @Override
    public boolean update(CustomAttributeCodeDO code) {
        try{
            return dao.update(code) > 0;
        }catch(Exception e){
            log.error("update CustomAttributeCode  error",e);
            return false;
        }
    }
}
