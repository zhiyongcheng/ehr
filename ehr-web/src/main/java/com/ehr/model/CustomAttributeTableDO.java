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
    private String changeFlag;
    private int displayOrder;
    private String isSystemDefault;
    private int createdBy;
    private Date createDate;
    private int lastUpdatedBy;
    private Date lastUpdateDate;
    //系统默认初始化表id System_init_info中parentId大于0的id
    private int subSysInitSinfoId;
}
