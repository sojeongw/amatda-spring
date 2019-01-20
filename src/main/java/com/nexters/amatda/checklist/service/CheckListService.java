package com.nexters.amatda.checklist.service;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.nexters.amatda.checklist.CheckList;
import com.nexters.amatda.checklist.dao.CheckListDao;

@Service
public class CheckListService implements ICheckListService{
	
	@Autowired
	CheckListDao dao;

	@Override
	public void listItemRegister(CheckList checkList) {
		// TODO Auto-generated method stub
		
		printLists(dao.listItemInsert(checkList));
		
		/* 실제 DB 생성 시 
		int result = dao.listInsert(checkList);
		
		if (result == 0) {
			System.out.println("fail");
		} else {
			System.out.println("success");
		}
		*/
		
	}
	
	
	///////////////// 임시 db 결과 출력 기능 /////////////////
	private void printLists(Map<String, CheckList> map) {
		
		Set<String> keys = map.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			CheckList cl = map.get(key);
			printList(cl);
		}
		
	}
	
	private void printList(CheckList cl) {
		
		System.out.print("checklist title:" + cl.getItemTitle() + "\t");
		
		
	}	
	///////////////// 임시 db 결과 출력 끝 /////////////////

	@Override
	public CheckList listItemSearch(CheckList checkList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CheckList listItemModify(CheckList checkList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listItemRemove(CheckList checkList) {
		// TODO Auto-generated method stub
		return 0;
	}

}
