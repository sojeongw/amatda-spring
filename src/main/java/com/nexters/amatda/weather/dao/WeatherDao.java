package com.nexters.amatda.weather.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.nexters.amatda.weather.WeatherVO;

@Repository
public class WeatherDao implements IWeatherDao {
	
	private JdbcTemplate template;

	// 스프링 설정 파일(servlet-context)에 설정한 DB 정보를 자동 주입한다.
	@Autowired
	public WeatherDao(DriverManagerDataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}

	@Override
	public int weatherInsert(WeatherVO weatherVO) {
		
		return 0;
	}

	@Override
	public WeatherVO weatherSelect(WeatherVO weatherVO) {
		List<WeatherVO> weatherVOs = null;

		final String sql = "SELECT * FROM weather where city_id = ? AND month = ?";
		
		weatherVOs = template.query(sql, new Object[] { weatherVO.getCity_id(), weatherVO.getMonth() }, new RowMapper<WeatherVO>() {

			@Override
			public WeatherVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				WeatherVO wthr = new WeatherVO();
				System.out.println(Integer.parseInt(rs.getString("city_id")));
				System.out.println(Integer.parseInt(rs.getString("month")));
				
				// response
				wthr.setCity_id(Integer.parseInt(rs.getString("city_id"))); // record set의 정보를 가져옴.
				wthr.setMonth(Integer.parseInt(rs.getString("month")));
				wthr.setWeather_status(rs.getString("weather_status"));
				wthr.setWeather_id(Integer.parseInt(rs.getString("weather_id")));
				wthr.setTemperature_avg(Float.parseFloat(rs.getString("temperature_avg")));
				
			
			
				return wthr;
			}
		});

		if (weatherVOs.isEmpty()) // 가져온 데이터가 없으면 null
			return null;
		
		
		
		System.out.println(weatherVOs.get(0).toString());
		return weatherVOs.get(0);
	}

	@Override
	public int weatherUpdate(WeatherVO weatherVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int weatherDelete(WeatherVO weatherVO) {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
