package com.ehr.service;

import com.ehr.model.OrganizationDO;
import com.ehr.model.PositionDO;
import com.ehr.model.OrganizationDO;

import java.util.List;

public interface OrganizationService {

	public boolean insert(OrganizationDO position);

	public List<OrganizationDO> getOrganizationList(Integer id, Integer siteId, Integer parentId,
													Integer status,String orderStr,Integer offset,
													Integer limit);

	public int getOrgCount(Integer siteId, Integer parentId, Integer status);

	public boolean update(OrganizationDO position);
}
