package com.ehr.dao;
 
import java.util.List;
import java.util.Map;

import com.ehr.model.PositionDO;
import com.ehr.model.PositionDO;
import com.ehr.model.PositionDO;

public interface PositionDAO {
	
	public int insert(PositionDO position);
	
	public List<PositionDO> getPositionList(Map<String,Object> map);
	
	public int update(PositionDO position);
}
