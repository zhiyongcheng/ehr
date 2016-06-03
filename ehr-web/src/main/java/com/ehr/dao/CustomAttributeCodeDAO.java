package com.ehr.dao;

import com.ehr.model.CustomAttributeCodeDO;
import com.ehr.model.SiteDO;

import java.util.List;
import java.util.Map;

public interface CustomAttributeCodeDAO {
	
	public int insert(CustomAttributeCodeDO trace);
	
	public List<CustomAttributeCodeDO> getAttributeCodeList(Map<String, Object> map);
	
	public int update(CustomAttributeCodeDO trace);
}
