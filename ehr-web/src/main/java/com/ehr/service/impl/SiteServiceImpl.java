package com.ehr.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ehr.dao.SiteDAO;
import com.ehr.model.SiteDO;
import com.ehr.service.SiteService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SiteServiceImpl implements SiteService {
	@Autowired
	public SiteDAO siteDAO;
	@Override
	public boolean insert(SiteDO site) {
		try{
			return siteDAO.insert(site) > 0;
		}catch(Exception e){
			log.error("insert site error",e);
			return false;
		}
	}

	@Override
	public List<SiteDO> getSiteList(Integer id,Integer parentId,String status,String siteType) {
		Map<String, Object> map = new HashMap();
		if(null != id && id > 0){
			map.put("id", id);
		}
		if(null != parentId){
			map.put("parentId", parentId);
		}
		if(StringUtils.isNoneBlank(status)){
			map.put("status", status);
		}
		if(StringUtils.isNoneBlank(siteType)){
			map.put("siteType", siteType);
		}
		return siteDAO.getSiteList(map);
	}

	@Override
	public boolean updateSite(SiteDO site) {
		try{
			return siteDAO.update(site)>0;
		}catch(Exception e){
			log.error("update site error",e);
			return false;
		}
	}

}
