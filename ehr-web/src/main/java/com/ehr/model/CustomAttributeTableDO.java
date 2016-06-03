package com.ehr.model;

import java.util.Date;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
public class CustomAttributeTableDO {
    private int id;
    private int siteId;
    private int cattId;
    private String cattCode;
    private String name;
    private String nameEn;
    private String attributeTableName;
    private String changeflag;
    private int displayOrder;
    private String isSystemDefault;
    private int createBy;
    private Date createDate;
    private int updateBy;
    private Date updateDate;
}
