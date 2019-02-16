package com.nexters.amatda.weather.service;

import com.nexters.amatda.weather.WeatherVO;

public interface IWeatherService {
	
	void weatherRegister(WeatherVO weatherVO);
	WeatherVO weatherSearch(WeatherVO weatherVO);
	WeatherVO[] weatherModify(WeatherVO weatherVO);
	void weatherRemove(WeatherVO weatherVO);

}
