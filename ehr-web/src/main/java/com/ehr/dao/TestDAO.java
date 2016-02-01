package com.ehr.dao;

import com.ehr.model.CrashTraceV2DO;

public interface TestDAO {
public int insert(CrashTraceV2DO trace);
public CrashTraceV2DO getCrash(long id);
}
