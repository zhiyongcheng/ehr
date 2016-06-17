package com.ehr.controller;

import com.alibaba.fastjson.JSON;
import com.ehr.model.OrganizationDO;
import com.ehr.model.PageListVO;
import com.ehr.model.SiteDO;
import com.ehr.service.InitSiteTablesService;
import com.ehr.service.OrganizationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Slf4j
@Controller
@RequestMapping(value="/org")
public class OrgController {
	@Autowired
	OrganizationService organizationService;

	@RequestMapping(value="/orgList.do",method=RequestMethod.GET)
	@ResponseBody
	public void orgLsit(HttpServletRequest request, HttpServletResponse response, Integer siteId)   {
		PrintWriter out = null;
		try {
			siteId = 1;
			String page = request.getParameter("page"); // 取得当前页数,注意这是jqgrid自身的参数
			String rowsStr = request.getParameter("rows"); // 取得每页显示行数，,注意这是jqgrid自身的参数
			int rows = Integer.parseInt(rowsStr);
			//总行数
			int records = organizationService.getOrgCount(siteId,0,null);

			PageListVO<OrganizationDO> pageVo = new PageListVO<>();
			pageVo.config(rows,page,records+"");
			List<OrganizationDO> orgList =
					organizationService.getOrganizationList(null,siteId,0,null,null,pageVo.getOffset(),rows);
			pageVo.setRows(orgList);
			out = response.getWriter();
			System.out.println(JSON.toJSONString(pageVo));
			out.write(JSON.toJSONString(pageVo));

		} catch (Exception e) {
			log.error("query orgList error",e);
		}finally {
			out.flush();
			out.close();
		}
	}
	@RequestMapping(value="/orgView.do",method=RequestMethod.GET)
	public String orgView(HttpServletRequest request,Integer siteId){

		return "organization/org/orgList";
	}
}
