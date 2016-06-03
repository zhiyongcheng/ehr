package com.ehr.service;

import com.ehr.model.OrganizationDO;
import com.ehr.model.PositionDO;

import java.util.List;

public interface OrganizationService {

	public boolean insert(OrganizationDO position);

	public List<OrganizationDO> getOrganizationList(Integer id, Integer siteId, Integer parentId, Integer status);

	public boolean update(OrganizationDO position);
}
