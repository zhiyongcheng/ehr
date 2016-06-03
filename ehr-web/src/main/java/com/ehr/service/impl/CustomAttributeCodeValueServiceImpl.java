package com.ehr.service.impl;

import com.ehr.dao.CustomAttributeCodeValueDAO;
import com.ehr.model.CustomAttributeCodeValueDO;
import com.ehr.service.CustomAttributeCodeValueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class CustomAttributeCodeValueServiceImpl implements CustomAttributeCodeValueService {
    @Autowired
    public CustomAttributeCodeValueDAO dao;
    @Override
    public boolean insert(CustomAttributeCodeValueDO codeValue) {

        try{
            return dao.insert(codeValue) > 0;
        }catch(Exception e){
            log.error("insert CustomAttributeCodeValue error",e);
            return false;
        }
    }

    @Override
    public List<CustomAttributeCodeValueDO> getAttributeCodeValueList(Integer id,Integer codeId) {
        Map<String, Object> map = new HashMap();
        if(null != id && id > 0){
            map.put("id", id);
        }
        if(null != codeId){
            map.put("codeId", codeId);
        }
        return dao.getAttributeCodeValueList(map);
    }

    @Override
    public boolean update(CustomAttributeCodeValueDO codeValue) {
        try{
            return dao.update(codeValue) > 0;
        }catch(Exception e){
            log.error("update CustomAttributeCodeValue error",e);
            return false;
        }
    }
}
