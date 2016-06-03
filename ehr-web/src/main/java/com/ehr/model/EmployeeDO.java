package com.ehr.model;

import java.util.Date;
import lombok.Data;

@Data
public class EmployeeDO {
	private int id;
	private int siteId;
	private int orgId;
	private String name;
	private String positionId;
	private String userDatabaseId;
	private String userCode;
	private String idCardType;
	private String idCard;
	private String sex;
	private int createBy;
	private Date createDate;
	private int updateBy;
	private Date updateDate;
}
