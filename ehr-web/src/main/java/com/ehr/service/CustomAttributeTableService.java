package com.ehr.service;

import com.ehr.model.CustomAttributeCodeDO;
import com.ehr.model.CustomAttributeTableDO;

import java.util.List;

public interface CustomAttributeTableService {
    public boolean insert(CustomAttributeTableDO table);

    public List<CustomAttributeTableDO> getAttributeTableList(Integer id, Integer siteId, Integer cattId, String changeFlag);

    public boolean update(CustomAttributeTableDO table);
}
