package com.nexters.amatda.carrier.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nexters.amatda.carrier.CarrierVO;
import com.nexters.amatda.carrier.service.CarrierService;

@Controller
public class CarrierController {
	
	@Autowired
	CarrierService service;
	
	@ModelAttribute("cp")
	public String getContextPath(HttpServletRequest request) {
		return request.getContextPath();
	}
	
	@RequestMapping(value="/printList")
	public @ResponseBody CarrierVO printList() {
		
		CarrierVO vo = new CarrierVO();
		
		return vo;
	}
	
	@RequestMapping(value = "/addCarrier", method = RequestMethod.GET)
	public String addCarrier(CarrierVO carrierVO) {
		System.out.println("addCarrier controller");
		
		service.carrierRegister(carrierVO);
		
		return "redirect:printList";
	}
	
	@RequestMapping(value = "/listCarrier", method = RequestMethod.POST)
	public String listCarrier(CarrierVO carrierVO) {
		System.out.println("listCarrier controller");
		
		service.carrierSearch(carrierVO);
		
		
		return "redirect:printList";
	}
	
	/*
	 @RequestMapping("/write")
		public String write(HttpServletRequest request, Model model) {
		
		System.out.println("write()");
		
		model.addAttribute("request", request);
		command = new BWriteCommand();
		command.execute(model);
		
		return "redirect:list";
	}
	 * */
	
	
	
	/*@RequestMapping(value="/list")
	@ResponseBody
	public Map<String, Object> printList(Model model) {
		
		Map<String, Object> map = new HashMap<String, Object>();
    
		System.out.println("printList()");
		command = new BListCommand( );
		command.execute(model);
		
		map = model.asMap();
		ArrayList<BDto> dtos = (ArrayList<BDto>) map.get("list");
		
		map.clear();
		map.put("list", dtos);
		
		return map;
	}*/
	
	/*
 	@RequestMapping("/doC")
	public @ResponseBody JsonTestVO doC() {
	JsonTestVO vo = new JsonTestVO();
	vo.name="제이슨 데이터 이다.";
	vo.age=999;
		
	return vo;
		}
	 * */
	
	

}
