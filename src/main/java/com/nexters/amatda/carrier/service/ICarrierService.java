package com.nexters.amatda.carrier.service;

import com.nexters.amatda.carrier.CarrierVO;

public interface ICarrierService {
	
	void carrierRegister(CarrierVO carrierVO);
	void carrierSearch(CarrierVO carrierVO);
	CarrierVO[] carrierModify(CarrierVO carrierVO);
	void carrierRemove(CarrierVO carrierVO);

}
