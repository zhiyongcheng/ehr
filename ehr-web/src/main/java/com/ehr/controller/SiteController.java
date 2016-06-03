package com.ehr.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ehr.model.SiteDO;


@Controller
public class SiteController {
	 
	@RequestMapping(value="/site/initSite.do",method=RequestMethod.POST)
	public String testQuery(HttpServletRequest request,@ModelAttribute("site") SiteDO site){

		 
		return "test";
	
	
	}
	 
}
