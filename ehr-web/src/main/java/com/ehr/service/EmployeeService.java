package com.ehr.service;

import com.ehr.model.EmployeeDO;
import com.ehr.model.SiteDO;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

	public boolean insert(EmployeeDO emp);

	public List<EmployeeDO> getEmployeeList(Integer id,Integer siteId,Integer positionId);

	public boolean update(EmployeeDO emp);
}
