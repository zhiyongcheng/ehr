package com.ehr.model;

import lombok.Getter;
import lombok.Setter;

import org.apache.ibatis.type.Alias;

@Alias("crashtracev2")
public class CrashTraceV2DO  {

    private static final long serialVersionUID = 1L;

    @Setter
    @Getter
    private String crashName;
    @Setter
    @Getter
    private long crashNameId;
    @Setter
    @Getter
    private String cause;
    @Setter
    @Getter
    private String threads;
    @Setter
    @Getter
    private String activityHistory;
    @Setter
    @Getter
    private String deviceInfo;
    @Setter
    @Getter
    private String buildId;
    @Setter
    @Getter
    private String runningApps;
    // MOBILE-426 add start
    @Setter
    @Getter
    private String exceptionType;
    @Setter
    @Getter
    private String exceptionFile;
    @Setter
    @Getter
    private String exceptionClass;
    @Setter
    @Getter
    private String exceptionMethod;
    @Setter
    @Getter
    private String exceptionIndex;

    // MOBILE-426 add end

    public CrashTraceV2DO() {}

   

   
}
