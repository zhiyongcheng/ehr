package com.ehr.dao;
 
import java.util.List;
import java.util.Map;
import com.ehr.model.CustomAttributeTableColumnDO;
import com.ehr.model.CustomAttributeTableColumnDO;
import org.apache.ibatis.annotations.Param;

public interface CustomAttributeTableColumnDAO {
	
	public int insert(CustomAttributeTableColumnDO code);

	public int batchInsert(List<CustomAttributeTableColumnDO> column);

	public List<CustomAttributeTableColumnDO> getTableColumnList(Map<String,Object> map);
	
	public int update(CustomAttributeTableColumnDO code);
}
