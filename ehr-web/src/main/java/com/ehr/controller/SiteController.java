package com.ehr.controller;

import javax.servlet.http.HttpServletRequest;

import com.ehr.service.InitSiteTablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ehr.model.SiteDO;


@Controller
public class SiteController {
	@Autowired
	InitSiteTablesService initSiteTablesService;
	@RequestMapping(value="/site/initSite.do",method=RequestMethod.GET)
	public String testQuery(HttpServletRequest request,@ModelAttribute("site") SiteDO site){

		boolean isSuccess = initSiteTablesService.initSiteTables("睿创",null,null,"C");
		request.setAttribute("msg",isSuccess);
		return "test";
	
	
	}

	 
}
