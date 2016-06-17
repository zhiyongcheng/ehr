package com.ehr.service;

import com.ehr.model.CustomAttributeTableColumnDO;
import com.ehr.model.CustomAttributeTableTypeDO;
import com.ehr.model.CustomAttributeTableColumnDO;

import java.util.List;

public interface CustomAttributeTableColumnService {
    public boolean insert(CustomAttributeTableColumnDO column);

    public List<CustomAttributeTableColumnDO> getAttributeTableColumnList(Integer id, Integer siteId, Integer catId,String catName,Integer columnType,String isRequired);

    public boolean update(CustomAttributeTableColumnDO column);
}
