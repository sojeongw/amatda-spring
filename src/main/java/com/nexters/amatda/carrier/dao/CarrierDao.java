package com.nexters.amatda.carrier.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.nexters.amatda.carrier.CarrierVO;

@Repository
public class CarrierDao implements ICarrierDao{
	
	private JdbcTemplate template;

	// 스프링 설정 파일(servlet-context)에 설정한 DB 정보를 자동 주입한다.
	@Autowired
	public CarrierDao(DriverManagerDataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}

	/*
	 1. 캐리어 테이블 ( carrier )

   캐리어 id (cId) - int  - Primary Key
   국가 (cCountry) - varchar
   
   여행기간(cPeriod) -int
   생성날짜(cCreated) - datetime

	2, 옵션 테이블 ( opt ) -> arraylist로 만들기
	: 캐리어 선택할 때 수영/요가/... 등의 내용을 추가하는 기능

   옵션 id (oId) - int - Primary Key
   캐리어 id(ocId) - int - Foreign Key
   카테고리 id (oCategory) - int
	*/
	
	@Override
	public int carrierInsert(final CarrierVO carrierVO) {
		int result = 0;
		
		

		final String sql = "INSERT INTO carrier (cId, cCountry, cPeriod) values (?,?,15) ";

		result = template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, carrierVO.getcId());
				pstmt.setString(2, carrierVO.getcCountry());
				////////////////////////////////////////////
//				pstmt.setInt(3, carrierVO.getcId());
//				pstmt.setInt(4, carrierVO.getOcId());
//				pstmt.setInt(5, carrierVO.getoCategory());
			}
		});

		return result;
	}

	@Override
	public CarrierVO carrierSelect(final CarrierVO carrierVO) {
		// TODO Auto-generated method stub
		
		List<CarrierVO> carrierVOs = null;

		final String sql = "SELECT * FROM carrier WHERE cId = ? AND cCountry = ?";

		/*
		 * carrierVOs = template.query(sql, new PreparedStatementSetter() {
			// 실제 넣을 데이터를 매핑하는 방법
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, carrierVO.getcCountry());
			}
		}, new RowMapper<CarrierVO>() {

			@Override
			public CarrierVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				CarrierVO carr = new CarrierVO();
				carr.setcId(rs.getInt("cId")); // record set의 정보를 가져옴.
				carr.setcCountry(rs.getString("cCountry"));
			
				return carr;
			}
		});
		*/
		
		carrierVOs = template.query(sql, new Object[] { carrierVO.getcId(), carrierVO.getcCountry() }, new RowMapper<CarrierVO>() {

			@Override
			public CarrierVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				CarrierVO carr = new CarrierVO();
				carr.setcId(rs.getInt("cId")); // record set의 정보를 가져옴.
				carr.setcCountry(rs.getString("cCountry"));
			
				return carr;
			}

		});

		if (carrierVOs.isEmpty()) // 가져온 데이터가 없으면 null
			return null;

		return carrierVOs.get(0);
		
		//return null;
	}

	@Override
	public int carrierUpdate(CarrierVO carrierVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int carrierDelete(CarrierVO carrierVO) {
		// TODO Auto-generated method stub
		return 0;
	}

}
