package com.ehr.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ehr.model.MenuTreeNode;
import com.ehr.model.SiteDO;
import com.ehr.service.SiteService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
@RequestMapping(value="/menu")
public class MenuController {
	@Autowired
	SiteService siteService;

	@ResponseBody
	@RequestMapping(value="/siteMenu.do",method=RequestMethod.GET)
	public void testQuery(HttpServletRequest request, HttpServletResponse response){
		PrintWriter writer=null;
		try {
			int siteId = 1;

			List<SiteDO> listSite = siteService.getSiteList(siteId,null,null,null,null);
			List<MenuTreeNode> treeNodes = new ArrayList<>();
			getChildSite(listSite,treeNodes);
			for(MenuTreeNode treeNode:treeNodes){
				for(MenuTreeNode treeNodeTemp:treeNodes){
					if(treeNode.getId() == treeNodeTemp.getPId()){
						if(treeNode.getId() == siteId){
							treeNode.setOpen(true);
						}
						treeNode.setIconSkin("pIcon01");
					}
				}
			}
			writer = response.getWriter();
			writer.write(JSON.toJSONString(treeNodes));
		} catch (Exception e) {
			log.error("query siteMenu error",e);
		}finally {
			writer.flush();
			writer.close();
		}

	}

	private void  getChildSite(List<SiteDO> listSite,List<MenuTreeNode> treeNodes){
		for(SiteDO siteDO:listSite){
			MenuTreeNode treeNode = new MenuTreeNode();
			treeNode.setId(siteDO.getId());
			treeNode.setName(siteDO.getName());
			treeNode.setPId(siteDO.getParentId());
			treeNode.setIconSkin("icon01");
			treeNodes.add(treeNode);
			List<SiteDO> listSites = siteService.getSiteList(null,null,siteDO.getId(),null,null);
			getChildSite(listSites, treeNodes);
		}
	}
	 
}
