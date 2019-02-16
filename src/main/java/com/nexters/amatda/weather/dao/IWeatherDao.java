package com.nexters.amatda.weather.dao;

import com.nexters.amatda.weather.WeatherVO;

public interface IWeatherDao {
	
	int weatherInsert(WeatherVO weatherVO);
	WeatherVO weatherSelect(WeatherVO weatherVO);
	int weatherUpdate(WeatherVO weatherVO);
	int weatherDelete(WeatherVO weatherVO);

}
