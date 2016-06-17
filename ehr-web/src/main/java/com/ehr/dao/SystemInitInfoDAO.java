package com.ehr.dao;

import com.ehr.model.SiteDO;
import com.ehr.model.SystemInitInfoDO;

import java.util.List;
import java.util.Map;

public interface SystemInitInfoDAO {
	
	public int insert(SystemInitInfoDO initInfoDO);
	
	public List<SystemInitInfoDO> getSystemInitInfoList(Map<String, Object> map);
	
	public int update(SystemInitInfoDO initInfoDO);

	public List<SystemInitInfoDO>  getAllSubSystemInitInfoList();

}
