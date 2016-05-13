package com.ehr.controller;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ehr.model.CrashTraceV2DO;
import com.ehr.model.TestComplexView;
import com.ehr.service.TestService;
@Slf4j
@Controller
public class TestController {
	@Autowired
	public TestService testService;
	@RequestMapping(value="/ehr/test.do",method=RequestMethod.GET)
	public String testQuery(HttpServletRequest request,Long id ){

		CrashTraceV2DO crashTrace = testService.getCrash(id);
		TestComplexView tv = testService.getTestComplexView();
		request.setAttribute("tv",tv);
		request.setAttribute("crashTrace",crashTrace);
		request.setAttribute("test","helloworld");
		log.info("TestController:{}","success");
		//进入test.jsp
		return "test";
	}
	@RequestMapping(value="/ehr/testGetComplexView.do",method=RequestMethod.GET)
	@ResponseBody
	public TestComplexView testQueryList(HttpServletRequest request){
		TestComplexView tv = testService.getTestComplexView();
		return tv;
	}
	@RequestMapping(value="/ehr/testInsert.do",method=RequestMethod.POST)
	public String testInsert(HttpServletRequest request){
		request.setAttribute("test","helloworld");
		return "test";
	}
}
