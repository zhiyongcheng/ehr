package com.ehr.dao;
 
import java.util.List;
import java.util.Map;
import com.ehr.model.SiteDO;

public interface SiteDAO {
	
	public int insert(SiteDO site);
	
	public List<SiteDO> getSiteList(Map<String,Object> map);
	
	public int update(SiteDO site);
}
