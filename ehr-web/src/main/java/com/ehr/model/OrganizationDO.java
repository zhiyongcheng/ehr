package com.ehr.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
public class OrganizationDO {
    private int id;
    private int siteId;
    private int parentId;
    private String name;
    private String orgCode;
    private String objectType;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    public Date registerDate;
    private String isRoot;
    private String status;
    private int createdBy;
    private Date createDate;
    private int lastUpdatedBy;
    private Date lastUpdateDate;
}
