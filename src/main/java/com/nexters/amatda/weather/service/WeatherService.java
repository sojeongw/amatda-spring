package com.nexters.amatda.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexters.amatda.weather.WeatherVO;
import com.nexters.amatda.weather.dao.WeatherDao;

@Service
public class WeatherService implements IWeatherService{
	
	@Autowired
	WeatherDao dao;

	@Override
	public void weatherRegister(WeatherVO weatherVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WeatherVO weatherSearch(WeatherVO weatherVO) {
		// TODO Auto-generated method stub
		
		WeatherVO wthr = dao.weatherSelect(weatherVO);
		
		if(wthr == null) {
			System.out.println("weatherSearch fail");
		}else {
			System.out.println("weatherSearch success");
		}
		
		return wthr;
	}

	@Override
	public WeatherVO[] weatherModify(WeatherVO weatherVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void weatherRemove(WeatherVO weatherVO) {
		// TODO Auto-generated method stub
		
	}

}
