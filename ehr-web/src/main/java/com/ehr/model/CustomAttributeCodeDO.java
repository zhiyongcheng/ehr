package com.ehr.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public class CustomAttributeCodeDO {
    private int id;
    private int siteId;
    private String codeName;
    private String codeNameEn;
    private String isGeneral;
    private String maxLength;
    private int isShow;
    private int createdBy;
    private Date createDate;
    private int lastUpdatedBy;
    private Date lastUpdateDate;
}
