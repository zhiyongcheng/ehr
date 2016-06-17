package com.ehr.service;

import com.ehr.model.CustomAttributeTableTypeDO;
import com.ehr.model.CustomAttributeTableDO;
import com.ehr.model.CustomAttributeTableTypeDO;
import com.ehr.model.CustomAttributeTableTypeDO;

import java.util.List;

public interface CustomAttributeTableTypeService {
    public boolean insert(CustomAttributeTableTypeDO table);

    public List<CustomAttributeTableTypeDO> getAttributeTableTypeList(Integer id, Integer siteId,String cattCode);

    public boolean update(CustomAttributeTableTypeDO table);
}
