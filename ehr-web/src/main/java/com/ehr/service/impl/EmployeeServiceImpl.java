package com.ehr.service.impl;

import com.ehr.dao.EmployeeDAO;
import com.ehr.model.EmployeeDO;
import com.ehr.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    public EmployeeDAO dao;
    @Override
    public boolean insert(EmployeeDO emp) {
        try{
            return dao.insert(emp) > 0;
        }catch(Exception e){
            log.error("insert site error",e);
            return false;
        }

    }

    @Override
    public List<EmployeeDO> getEmployeeList(Integer id, Integer siteId, Integer positionId) {
        Map<String, Object> map = new HashMap();
        if(null != id && id > 0){
            map.put("id", id);
        }
        if(null != siteId){
            map.put("siteId", siteId);
        }
        if(null != positionId){
            map.put("positionId", positionId);
        }
        return dao.getEmployeeList(map);
    }

    @Override
    public boolean update(EmployeeDO emp) {
        try{
            return dao.update(emp) > 0;
        }catch(Exception e){
            log.error("insert site error",e);
            return false;
        }
    }

}
