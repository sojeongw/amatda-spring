
package com.nexters.amatda.checklist.service;

import com.nexters.amatda.checklist.CheckList;

public interface ICheckListService {
	
	void listItemRegister(CheckList checkList);
	void listItemSearch(CheckList checkList);
	CheckList[] listItemModify(CheckList checkList);
	void listItemRemove(CheckList checkList);


}
