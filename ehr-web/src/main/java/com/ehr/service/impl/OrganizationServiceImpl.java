package com.ehr.service.impl;

import com.ehr.dao.OrganizationDAO;
import com.ehr.service.OrganizationService;
import com.ehr.dao.OrganizationDAO;
import com.ehr.model.OrganizationDO;
import com.ehr.service.OrganizationService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    public OrganizationDAO dao;
    @Override
    public boolean insert(OrganizationDO position) {
        try{
            return dao.insert(position) > 0;
        }catch(Exception e){
            log.error("insert Organization error",e);
            return false;
        }
    }

    @Override
    public List<OrganizationDO> getOrganizationList(Integer id, Integer siteId, Integer parentId,
                                                    Integer status,String orderStr,Integer offset,
                                                    Integer limit){
        Map<String, Object> map = new HashMap();
        if(null != id && id > 0){
            map.put("id", id);
        }
        if(null != siteId){
            map.put("siteId", siteId);
        }
        if(null != parentId){
            map.put("parentId", parentId);
        }
        if(null != status){
            map.put("status", status);
        }
        if(StringUtils.isNoneBlank(orderStr)){
            map.put("orderStr", orderStr);
        }
        if(null != offset){
            map.put("offset", offset);
        }
        if(null != limit && limit>0){
            map.put("limit", limit);
        }
        return dao.getOrganizationList(map);
    }

    @Override
    public int getOrgCount(Integer siteId, Integer parentId, Integer status) {
        Map<String, Object> map = new HashMap();
        if(null != siteId){
            map.put("siteId", siteId);
        }
        if(null != parentId){
            map.put("parentId", parentId);
        }
        if(null != status){
            map.put("status", status);
        }
        return dao.getOrgCount(map);
    }

    @Override
    public boolean update(OrganizationDO position) {
        try{
            return dao.update(position) > 0;
        }catch(Exception e){
            log.error("update position  error",e);
            return false;
        }
    }
}
