package com.app.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.service.dao.CategoryGroupService;
import com.service.dao.DashboardService;
import java.io.Serializable;

@Controller
@Scope("session")
public class AppController implements Serializable {
	private static final long serialVersionUID = 1L;

	private String reDirectTo = null;

	@Autowired(required = true)
	DashboardService dashBoardServies;

	public void setDashBoardServies(DashboardService dashBoardServies) {
		this.dashBoardServies = dashBoardServies;
	}
	
	@Autowired(required = true)
	CategoryGroupService categoryGroupService;
	public void setCategoryGroupService(CategoryGroupService categoryGroupService) {
		this.categoryGroupService = categoryGroupService;
	}

	@RequestMapping(value = "/landingPage", method = RequestMethod.GET)
	public ModelAndView globalRedirect(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		System.out.println("controller called133");
		model.addAttribute("tabs", dashBoardServies.getItems());
//		System.out.println("categoryGroups  :  "+categoryGroupService.getCategoryGroups());
		model.addAttribute("categoryGroups",categoryGroupService.getCategoryGroups());
		reDirectTo = "landingPage";
		return new ModelAndView(reDirectTo);
	}

}