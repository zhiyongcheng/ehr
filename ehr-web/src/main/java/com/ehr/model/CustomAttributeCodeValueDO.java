package com.ehr.model;

import lombok.Data;

import java.util.Date;

@Data
public class CustomAttributeCodeValueDO {
    private int id;
    private int codeId;
    private String codeValue;
    private String codeValueEn;
    private int createBy;
    private Date createDate;
    private int updateBy;
    private Date updateDate;
}
