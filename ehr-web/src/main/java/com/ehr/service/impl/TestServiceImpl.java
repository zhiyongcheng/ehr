package com.ehr.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.dao.TestDAO;
import com.ehr.model.CrashTraceV2DO;
import com.ehr.model.TestComplexView;
import com.ehr.service.TestService;
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDAO dao;
    public CrashTraceV2DO getCrash(long id){
    	return dao.getCrash(id);
    }
    public boolean insertCrash(CrashTraceV2DO trace){
    	return dao.insert(trace)>0;
    }
    public TestComplexView getTestComplexView(){
    	//业务逻辑代码都写到service中，事物在service层
    	List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		CrashTraceV2DO crashTrace = new CrashTraceV2DO();
		crashTrace.setBuildId("bId1");
		crashTrace.setCause("dcddcdc");
		TestComplexView tv = new TestComplexView();
		tv.setCrashTrace(crashTrace);
		tv.setList(list);
		tv.setParam1("p1");
		tv.setParam2("p2");
		return tv;
    }
}
