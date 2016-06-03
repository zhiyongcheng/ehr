package com.ehr.model;

import java.util.Date;
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
private Date registerDate;
private String isRoot;
private String status;
private int createBy;
private Date createDate;
private int updateBy;
private Date updateDate;
}
