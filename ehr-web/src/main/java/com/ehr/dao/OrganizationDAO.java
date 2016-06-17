package com.ehr.dao;
 
import java.util.List;
import java.util.Map;

import com.ehr.model.OrganizationDO;
import com.ehr.model.OrganizationDO;

public interface OrganizationDAO {
	
	public int insert(OrganizationDO org);
	
	public List<OrganizationDO> getOrganizationList(Map<String,Object> map);

	public int getOrgCount(Map<String,Object> map);

	public int update(OrganizationDO org);
}
