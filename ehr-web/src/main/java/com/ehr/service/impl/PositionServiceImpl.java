package com.ehr.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ehr.model.PositionDO;
import com.ehr.service.PositionService;
import com.ehr.dao.PositionDAO;
import com.ehr.model.PositionDO;
import com.ehr.service.PositionService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    public PositionDAO dao;
    @Override
    public boolean insert(PositionDO position) {

        try{
            return dao.insert(position) > 0;
        }catch(Exception e){
            log.error("insert site error",e);
            return false;
        }

    }

    @Override
    public List<PositionDO> getPositionList(Integer id, Integer siteId, Integer orgId, Integer status) {
        Map<String, Object> map = new HashMap();
        if(null != id && id > 0){
            map.put("id", id);
        }
        if(null != siteId){
            map.put("siteId", siteId);
        }
        if(null != orgId){
            map.put("orgId", orgId);
        }
        if(null != status){
            map.put("status", status);
        }
        return dao.getPositionList(map);
    }

    @Override
    public boolean update(PositionDO position) {

        try{
            return dao.update(position) > 0;
        }catch(Exception e){
            log.error("insert site error",e);
            return false;
        }
    }
}
