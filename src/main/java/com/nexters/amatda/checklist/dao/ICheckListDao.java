package com.nexters.amatda.checklist.dao;

import java.util.Map;

import com.nexters.amatda.checklist.CheckList;

public interface ICheckListDao {
	
	// 임시 DB >> 해쉬맵에 정보 저장 
//	Map<String, CheckList> listItemInsert(CheckList checkList);
//	CheckList listItemSelect(CheckList checkList);
//	CheckList listItemUpdate(CheckList checkList);
//	Map<String, CheckList> listItemDelete(CheckList checkList);

	
//	/* 실제 DB에 쓰일 것 
	int listItemInsert(CheckList checkList);
	CheckList listItemSelect(CheckList checkList);
	int listItemUpdate(CheckList checkList);
	int listItemDelete(CheckList checkList);
//	*/

}
