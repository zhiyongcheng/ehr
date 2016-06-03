package com.ehr.service;
 
import java.util.List;
import java.util.Map;

import com.ehr.model.SiteDO;

public interface SiteService {
	
	public boolean insert(SiteDO trace);
	
	public List<SiteDO> getSiteList(Integer id,Integer parent,String status,String siteType);

	public boolean updateSite(SiteDO trace);
}
