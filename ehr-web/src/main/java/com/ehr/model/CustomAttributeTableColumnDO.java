package com.ehr.model;

import java.util.Date;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
public class CustomAttributeTableColumnDO {
    private int id;
    private int siteId;
    private String columnName;
    private int catId;
    private String catName;
    private int columnType;
    private String columnDisplay;
    private String columnDisplayEn;
    private int columnLength;
    private int decimalPlaces;
    private int customAttributeCodeId;
    private String dateType;
    private String isRequired;
    private int displayOrder;
    private String descriptions;
    private String isShow;
    private int createdBy;
    private Date createDate;
    private int lastUpdatedBy;
    private Date lastUpdateDate;

    private int subSystemInfoId;
    private String parentTypeCode;
    private String typeCode;
}
