package com.ehr.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ehr.service.TestService;

@Controller
public class TestController {
	@Autowired
	public TestService testService;
	@RequestMapping(value="/ehr/test.do",method=RequestMethod.GET)
	public String test(HttpServletRequest request){
		request.setAttribute("test","helloworld");
		return "test";
	}
}
