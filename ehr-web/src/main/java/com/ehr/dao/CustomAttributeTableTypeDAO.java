package com.ehr.dao;
 
import java.util.List;
import java.util.Map;

import com.ehr.model.CustomAttributeTableTypeDO;
import com.ehr.model.CustomAttributeTableDO;
import com.ehr.model.CustomAttributeTableTypeDO;
import com.ehr.model.CustomAttributeTableTypeDO;
import org.apache.ibatis.annotations.Param;

public interface CustomAttributeTableTypeDAO {
	
	public int insert(CustomAttributeTableTypeDO tableType);

	public void batchInsert(List<CustomAttributeTableTypeDO> tableType);

	public List<CustomAttributeTableTypeDO> getTableTypeList(Map<String,Object> map);
	
	public int update(CustomAttributeTableTypeDO tableType);
}
