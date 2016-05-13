package com.ehr.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import org.apache.ibatis.type.Alias;

@Alias("crashtracev2")
@Data
public class CrashTraceV2DO  {

    private static final long serialVersionUID = 1L;

    private String crashName;
    private long crashNameId;
    private String cause;
    private String threads;
    private String activityHistory;
    private String deviceInfo;
    private String buildId;
    private String runningApps;
    private String exceptionType;
    private String exceptionFile;
    private String exceptionClass;
    private String exceptionMethod;
    private String exceptionIndex;

    public CrashTraceV2DO() {}

   

   
}
