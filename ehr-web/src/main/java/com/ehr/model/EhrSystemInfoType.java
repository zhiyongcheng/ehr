package com.ehr.model;

import lombok.Data;


@Data
public class EhrSystemInfoType {
    //ORG/POST/EMP
    private String typeCode;
    private String typeName;
    private String typeNameEn;
}
