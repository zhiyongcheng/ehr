package com.ehr.dao;
 
import java.util.List;
import java.util.Map;

import com.ehr.model.CustomAttributeTableDO;
import com.ehr.model.CustomAttributeTableDO;
import com.ehr.model.CustomAttributeTableDO;
import org.apache.ibatis.annotations.Param;

public interface CustomAttributeTableDAO {
	
	public int insert(CustomAttributeTableDO tableDO);

	public int batchInsert(@Param("dataList") List<CustomAttributeTableDO> table);

	public List<CustomAttributeTableDO> getTableList(Map<String,Object> map);
	
	public int update(CustomAttributeTableDO tableDO);
}
