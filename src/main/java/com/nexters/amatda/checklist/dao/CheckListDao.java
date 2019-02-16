package com.nexters.amatda.checklist.dao;


import org.springframework.stereotype.Repository;

import com.nexters.amatda.checklist.CheckList;

///* 실제 DB에서 쓰일 것들 
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//*/
@Repository
public class CheckListDao implements ICheckListDao {

	private JdbcTemplate template;

	// 스프링 설정 파일(servlet-context)에 설정한 DB 정보를 자동 주입한다.
	@Autowired
	public CheckListDao(DriverManagerDataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}

	
	// insert 예시 
	@Override
	public int listItemInsert(final CheckList checkList) {
		// TODO Auto-generated method stub
		int result = 0;
		
		

		final String sql = "INSERT INTO package (pId, pcId, pName, pColor, pCheck) values (3,3,?,'grey','N')";

		result = template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, checkList.getItemTitle());
			}
		});

		return result;
	}

	////////////////////////////////////////
	
	@Override
	public CheckList listItemSelect(CheckList checkList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listItemUpdate(CheckList checkList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int listItemDelete(CheckList checkList) {
		// TODO Auto-generated method stub
		return 0;
	}
	
//	*/
	
	
}
