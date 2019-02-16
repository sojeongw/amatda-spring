package com.nexters.amatda.carrier.dao;

import com.nexters.amatda.carrier.CarrierVO;

public interface ICarrierDao {

	int carrierInsert(CarrierVO carrierVO);
	CarrierVO carrierSelect(CarrierVO carrierVO);
	int carrierUpdate(CarrierVO carrierVO);
	int carrierDelete(CarrierVO carrierVO);
	
}
