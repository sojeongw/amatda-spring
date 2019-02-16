package com.nexters.amatda.carrier;

public class CarrierVO {
	
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
	private int cId;
	private String cCountry;
	
	private int oId;
	private int ocId;
	private int oCategory;
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcCountry() {
		return cCountry;
	}
	public void setcCountry(String cCountry) {
		this.cCountry = cCountry;
	}
	
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public int getOcId() {
		return ocId;
	}
	public void setOcId(int ocId) {
		this.ocId = ocId;
	}
	public int getoCategory() {
		return oCategory;
	}
	public void setoCategory(int oCategory) {
		this.oCategory = oCategory;
	}
	
	


}
