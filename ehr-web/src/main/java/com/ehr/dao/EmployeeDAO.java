package com.ehr.dao;
 
import java.util.List;
import java.util.Map;

import com.ehr.model.EmployeeDO;

public interface EmployeeDAO {
	
	public int insert(EmployeeDO emp);
	
	public List<EmployeeDO> getEmployeeList(Map<String,Object> map);
	
	public int update(EmployeeDO emp);
}
