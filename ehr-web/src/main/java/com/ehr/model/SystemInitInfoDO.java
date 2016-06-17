package com.ehr.model;

import lombok.Data;


@Data
public class SystemInitInfoDO {
    private int id;
    private String typeCode;
    private String typeName;
    private String typeNameEn;
    private String status;
    private String parentTypeCode;
}
