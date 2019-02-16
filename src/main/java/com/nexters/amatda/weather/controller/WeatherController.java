package com.nexters.amatda.weather.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nexters.amatda.weather.WeatherVO;
import com.nexters.amatda.weather.service.WeatherService;

@Controller
public class WeatherController {
	
	@Autowired
	WeatherService service;
	
	/*
	 * Map<String, Object> map = new HashMap<String, Object>();
    
		System.out.println("list()");
		command = new BListCommand( );
		command.execute(model);
		
		map = model.asMap();
		ArrayList<BDto> dtos = (ArrayList<BDto>) map.get("list");
		
		map.clear();
		map.put("list", dtos);
		
		return map;
		
		try{
           JSONArray returnSchool = (JSONArray)jsonObject.get("school");
            for(int i=0;i<returnSchool.size();i++){
                JSONObject returnSubject = (JSONObject) returnSchool.get(i);
                System.out.println("subject : "+returnSubject.get("subject1"));
                System.out.println("subject : "+returnSubject.get("subject2"));
            }
            String name = (String)jsonObject.get("name");
            System.out.println("name : " + name );
             
        }catch(Exception e){
            e.printStackTrace();
     }


출처: https://yoo-hyeok.tistory.com/36 [유혁의 엉터리 개발]
	 * */
	
	@RequestMapping(value="/printData")
	public @ResponseBody WeatherVO printData() {
		
		 WeatherVO vo = new WeatherVO();
	// 빈객체니까 당연이 안나오지 멍충
		 
		return vo;
		
		
	}
	
	@RequestMapping(value="weather", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getWeatherData(WeatherVO weatherVO) {
		
		System.out.println("getWeatherData controller");	
		
		WeatherVO wthr = service.weatherSearch(weatherVO);
		
		
		//ObjectMapper oMapper = new ObjectMapper();
		// object -> Map
        //List<String> list = oMapper.convertValue(wthr,);
		
		// 일단 list로 만들어야 나중에 map에 최종 넣을 때 []에 들어간다.
		List<WeatherVO> list = java.util.Arrays.asList(wthr);
        //System.out.println("map" + list);
        
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("weather",list);
		
/*
 * 
 *  ObjectMapper oMapper = new ObjectMapper();

        Student obj = new Student();
        obj.setName("mkyong");
        obj.setAge(34);
        obj.setSkills(Arrays.asList("java","node"));

        // object -> Map
        Map<String, Object> map = oMapper.convertValue(obj, Map.class);
        System.out.println(map);
 * */
		
		return resultMap;
	}

}
