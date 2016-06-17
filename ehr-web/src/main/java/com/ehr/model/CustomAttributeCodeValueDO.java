package com.ehr.model;

import lombok.Data;

import java.util.Date;

@Data
public class CustomAttributeCodeValueDO {
    private int id;
    private int codeId;
    private String codeValue;
    private String codeValueEn;
    private int createdBy;
    private Date createDate;
    private int lastUpdatedBy;
    private Date lastUpdateDate;
}
