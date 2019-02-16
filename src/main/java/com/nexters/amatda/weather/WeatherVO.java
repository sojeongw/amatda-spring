package com.nexters.amatda.weather;

public class WeatherVO {
	
	/*
	 * 1. 도시 테이블 ( city )
 	city_id - int -> primary key
 	city_name -> varchar

	2. 날씨 테이블 ( weather )
 	weather_id - int -> primary key
 	temperature_avg -> float
 	weather_status -> varchar
 	city_id -> int -> foreign key
 	month -> int
 	*/
	
	private int weather_id;
	private float temperature_avg;
	private String weather_status;
	private int month;	
	private int city_id;
	
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public int getWeather_id() {
		return weather_id;
	}
	public void setWeather_id(int weather_id) {
		this.weather_id = weather_id;
	}
	public float getTemperature_avg() {
		return temperature_avg;
	}
	public void setTemperature_avg(float temperature_avg) {
		this.temperature_avg = temperature_avg;
	}
	public String getWeather_status() {
		return weather_status;
	}
	public void setWeather_status(String weather_status) {
		this.weather_status = weather_status;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
		
	

}
