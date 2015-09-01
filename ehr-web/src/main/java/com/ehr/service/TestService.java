package com.ehr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.dao.TestDAO;
import com.ehr.model.CrashTraceV2DO;
@Service
public class TestService {
    @Autowired
    private TestDAO dao;
    public CrashTraceV2DO getCrash(long id){
    	return dao.getCrash(id);
    }
}
