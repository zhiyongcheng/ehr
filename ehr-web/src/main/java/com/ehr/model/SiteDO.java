package com.ehr.model;

import java.util.Date;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
public class SiteDO {
    private int id;
    private int parentId;
    private String name;
    private String status;
    private String siteType;
    private int customThemeId;
    private int createdBy;
    private Date createDate;
    private int lastUpdatedBy;
    private Date lastUpdateDate;
}
