package com.ehr.service;

import com.ehr.model.CustomAttributeCodeDO;
import com.ehr.model.CustomAttributeCodeValueDO;

import java.util.List;

public interface CustomAttributeCodeService {
    public boolean insert(CustomAttributeCodeDO code);

    public List<CustomAttributeCodeDO> getAttributeCodeList(Integer id, Integer siteId,String isShow,String isGeneral);

    public boolean update(CustomAttributeCodeDO code);
}
