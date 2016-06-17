package com.ehr.service;

import com.ehr.model.SystemInitInfoDO;

import java.util.List;
import java.util.Map;

/**
 * Created by cheng on 2016/6/12.
 */
public interface SystemInitInfoService {

    public int insert(SystemInitInfoDO initInfoDO);

    public List<SystemInitInfoDO> getAllRootSystemInitInfoList();

    public int update(SystemInitInfoDO initInfoDO);

    public List<SystemInitInfoDO> getAllSubSystemInitInfoList();

    public List<SystemInitInfoDO> getOneSubSystemInitInfoList(Integer id);
}
