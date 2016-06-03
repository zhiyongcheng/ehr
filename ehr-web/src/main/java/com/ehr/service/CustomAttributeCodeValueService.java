package com.ehr.service;

import com.ehr.model.CustomAttributeCodeValueDO;

import java.util.List;
import java.util.Map;

public interface CustomAttributeCodeValueService {
    public boolean insert(CustomAttributeCodeValueDO trace);

    public List<CustomAttributeCodeValueDO> getAttributeCodeValueList(Integer id,Integer codeId);

    public boolean update(CustomAttributeCodeValueDO trace);
}
