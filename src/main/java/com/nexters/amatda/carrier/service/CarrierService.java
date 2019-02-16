package com.nexters.amatda.carrier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexters.amatda.carrier.CarrierVO;
import com.nexters.amatda.carrier.dao.CarrierDao;

@Service
public class CarrierService implements ICarrierService{

	@Autowired
	CarrierDao dao;
	
	@Override
	public void carrierRegister(CarrierVO carrierVO) {
		int result = dao.carrierInsert(carrierVO);
		
		if (result == 0) {
			System.out.println("carrier insert fail");
		} else {
			System.out.println("carrier insert success");
		}
	}

	@Override
	public void carrierSearch(CarrierVO carrierVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CarrierVO[] carrierModify(CarrierVO carrierVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void carrierRemove(CarrierVO carrierVO) {
		// TODO Auto-generated method stub
		
	}

}
