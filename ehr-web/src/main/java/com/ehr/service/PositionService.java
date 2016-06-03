package com.ehr.service;

import com.ehr.model.EmployeeDO;
import com.ehr.model.PositionDO;

import java.util.List;
import java.util.Map;

public interface PositionService {

	public boolean insert(PositionDO position);

	public List<PositionDO> getPositionList(Integer id,Integer siteId,Integer orgId,Integer status);

	public boolean update(PositionDO position);
}
