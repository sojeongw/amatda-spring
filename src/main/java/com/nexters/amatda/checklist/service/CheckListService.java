package com.nexters.amatda.checklist.service;

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
		
		/*
		실제 DB 생성 시 
		int result = dao.listInsert(checkList);
		
		if (result == 0) {
			System.out.println("fail");
		} else {
			System.out.println("success");
		}
		*/
		
	}
	
//	@Override
//	public void memberSearch(Member member) {
//		printMember(dao.memberSelect(member));
//	}
	
	@Override
	public void listItemSearch(CheckList checkList) {
		// TODO Auto-generated method stub
		printList(dao.listItemSelect(checkList));
	} 
	
//	@Override
//	public Member[] memberModify(Member member) {
//		
//		Member memBef = dao.memberSelect(member);
//		Member memAft = dao.memberUpdate(member);
//		printMember(memAft);
//		
//		return new Member[]{memBef, memAft};
//	}

	@Override
	public CheckList[] listItemModify(CheckList checkList) {
		// TODO Auto-generated method stub
		CheckList chckliBefore = dao.listItemSelect(checkList);
		CheckList chckliAfter = dao.listItemUpdate(checkList);
		printList(chckliAfter);
		
		return new CheckList[] {chckliBefore,chckliAfter};
	}

//	@Override
//	public void memberRemove(Member member) {
//		printMembers(dao.memberDelete(member));
//	}
	
	@Override
	public void listItemRemove(CheckList checkList) {
		// TODO Auto-generated method stub
		printLists(dao.listItemDelete(checkList));
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



}
