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
    private String columnType;
    private String columnDisplay;
    private String columnDisplayEn;
    private String columnLength;
    private String decimalPlaces;
    private int cattId;
    private String dateType;
    private String isRequired;
    private int displayOrder;
    private String descriptions;
    private String isShow;
    private int createBy;
    private Date createDate;
    private int updateBy;
    private Date updateDate;
}
