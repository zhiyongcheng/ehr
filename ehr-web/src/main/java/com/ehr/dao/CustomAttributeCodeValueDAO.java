package com.ehr.dao;

import com.ehr.model.CustomAttributeCodeDO;
import com.ehr.model.CustomAttributeCodeValueDO;
import com.ehr.model.CustomAttributeCodeValueDO;

import java.util.List;
import java.util.Map;

public interface CustomAttributeCodeValueDAO {
	
	public int insert(CustomAttributeCodeValueDO trace);
	
	public List<CustomAttributeCodeValueDO> getAttributeCodeValueList(Map<String, Object> map);
	
	public int update(CustomAttributeCodeValueDO trace);
}
