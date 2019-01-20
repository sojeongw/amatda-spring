
package com.nexters.amatda.checklist.service;

import com.nexters.amatda.checklist.CheckList;

public interface ICheckListService {
	
	void listItemRegister(CheckList checkList);
	CheckList listItemSearch(CheckList checkList);
	CheckList listItemModify(CheckList checkList);
	int listItemRemove(CheckList checkList);


}
