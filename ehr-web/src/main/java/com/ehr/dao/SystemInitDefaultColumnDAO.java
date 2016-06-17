package com.ehr.dao;

import com.ehr.model.CustomAttributeTableColumnDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SystemInitDefaultColumnDAO {
	
	public int insert(CustomAttributeTableColumnDO code);


	public List<CustomAttributeTableColumnDO> getDefaultColumnList(Map<String, Object> map);

	public List<CustomAttributeTableColumnDO> getDefaultTableAndColumnList();

	public int update(CustomAttributeTableColumnDO code);
}
