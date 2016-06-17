package com.ehr.service.impl;

import com.ehr.dao.SystemInitInfoDAO;
import com.ehr.model.SystemInitInfoDO;
import com.ehr.service.SystemInitInfoService;
import com.ehr.dao.SystemInitInfoDAO;
import com.ehr.model.SystemInitInfoDO;
import com.ehr.service.SystemInitInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by cheng on 2016/6/12.
 */
@Service
public class SystemInitInfoServiceImpl implements SystemInitInfoService {
    @Autowired
    SystemInitInfoDAO dao;
    @Override
    public int insert(SystemInitInfoDO initInfoDO) {
        return 0;
    }

    @Override
    public List<SystemInitInfoDO> getAllRootSystemInitInfoList() {
        Map<String, Object> map = new HashMap();
        map.put("parentId", 0);
        return dao.getSystemInitInfoList(map);
    }

    @Override
    public List<SystemInitInfoDO> getAllSubSystemInitInfoList() {
        return dao.getAllSubSystemInitInfoList();
    }


    @Override
    public List<SystemInitInfoDO> getOneSubSystemInitInfoList(Integer parentId) {
        Map<String, Object> map = new HashMap();
        if(null != parentId && parentId > 0){
            map.put("parentId", parentId);
        }
        return dao.getSystemInitInfoList(map);
    }

    @Override
    public int update(SystemInitInfoDO initInfoDO) {
        return 0;
    }

}
