package com.nexters.amatda.checklist.controller;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nexters.amatda.HomeController;
import com.nexters.amatda.checklist.CheckList;
import com.nexters.amatda.checklist.service.CheckListService;

@Controller
public class CheckListController {
	
	@Autowired
	CheckListService service;
	
	@ModelAttribute("cp")
	public String getContextPath(HttpServletRequest request) {
		return request.getContextPath();
	}
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	


	@RequestMapping(value = "/itemList", method = RequestMethod.GET)
	public String itemList(CheckList checkList) {
		
		
		return "/checklist/itemList";
	}
	
	@RequestMapping(value = "/addItem", method = RequestMethod.GET)
	public String addItem(CheckList checkList) {
		
		
		service.listItemRegister(checkList);
		
		return "/checklist/addList";
	}
	
	@RequestMapping(value = "/searchItem", method = RequestMethod.GET)
	public String searchItem(CheckList checkList) {
		
		
		service.listItemSearch(checkList);
		
		return "/checklist/searchItem";
	}
	
	@RequestMapping(value = "/modifyItem", method = RequestMethod.POST)
	public ModelAndView modifyItem(CheckList checkList) {
		
		System.out.println( "controller");

		CheckList[] items = service.listItemModify(checkList);

		ModelAndView mav = new ModelAndView();

		// model
		mav.addObject("chckliBefore", items[0]);
		mav.addObject("chckliAfter", items[1]);

		// view
		mav.setViewName("modifyItemOk");

		// 객체 자체를 반환
		return mav;
	}
	
	
	
	

}
