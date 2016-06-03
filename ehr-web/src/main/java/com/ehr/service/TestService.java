package com.ehr.service;

import com.ehr.model.CrashTraceV2DO;
import com.ehr.model.TestComplexView;

public interface TestService {
	public CrashTraceV2DO getCrash(long id);
	public boolean insertCrash(CrashTraceV2DO trace);
	public TestComplexView getTestComplexView();
	public int createTable();
	public String getTest();

}
