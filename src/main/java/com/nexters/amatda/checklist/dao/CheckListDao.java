package com.nexters.amatda.checklist.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.nexters.amatda.checklist.CheckList;

/* 실제 DB에서 쓰일 것들 
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
*/
@Repository
public class CheckListDao implements ICheckListDao {
	
	////////// 임시 DB 처리 ////////// 
	
	private HashMap<String,CheckList> dbMap;
	
	public CheckListDao() {
		dbMap = new HashMap<String, CheckList>();
	}

	@Override
	public Map<String, CheckList> listItemInsert(CheckList checkList) {
		// TODO Auto-generated method stub
		
		
		dbMap.put(checkList.getItemTitle(), checkList);
		return dbMap;
	}

	@Override
	public CheckList listItemSelect(CheckList checkList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CheckList listItemUpdate(CheckList checkList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, CheckList> listItemDelete(CheckList checkList) {
		// TODO Auto-generated method stub
		return null;
	}


	
	/////////// 여기까지 임시 DB 처리 ////////////
	

	/* 지금은 디비가 안 만들어져 있으니 일단 주석
	private JdbcTemplate template;


	// 스프링 설정 파일(servlet-context)에 설정한 DB 정보를 자동 주입한다.
	@Autowired
	public CheckListDao(ComboPooledDataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}

	
	// insert 예시 
	@Override
	public int listInsert(final CheckList checkList) {
		// TODO Auto-generated method stub
		int result = 0;

		final String sql = "INSERT INTO checklist (list_title) values (?)";

		result = template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, checkList.getList_title());
			}
		});

		return result;
	}

	////////////////////////////////////////
	
	@Override
	public CheckList listSelect(CheckList checkList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listUpdate(CheckList checkList) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int listDelete(CheckList checkList) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	*/

}
