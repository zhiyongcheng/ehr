package com.ehr.model;

import java.util.Date;
import lombok.Data;

@Data
public class PositionDO {
	private int id;
	private int siteId;
	private int orgId;
	private String name;
	private String positionCode;
	private String status;
	private int createdBy;
	private Date createDate;
	private int lastUpdatedBy;
	private Date lastUpdateDate;
}
