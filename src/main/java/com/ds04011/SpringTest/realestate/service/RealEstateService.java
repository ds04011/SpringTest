package com.ds04011.SpringTest.realestate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringTest.realestate.domain.RealEstate;
import com.ds04011.SpringTest.realestate.repository.RealEstateRepository;

@Service
public class RealEstateService {
	
	@Autowired
	private RealEstateRepository realEstateRepository;
	
	public RealEstate getRealEstateById(int id) {
		return realEstateRepository.getRealEstateById(id);
	}
	
	public List<RealEstate> getRealEstateByPriceLimit(int rentprice) {
		return realEstateRepository.getRealEstateByPriceLimit(rentprice);
	}
	
	public List<RealEstate> getRealEstateByAreaPrice(int area, int price){
		return realEstateRepository.getRealEstateByAreaPrice(area, price);
	}
	
	public int addRealEstate(int realtorId
			, String address
			, int area
			, String type
			, int price
			, int rentPrice) {
		
		int count = realEstateRepository.insertRealEstate(realtorId, address, area, type, price, rentPrice);
		return count;
	}
	
	public int addRealEstateByEntity(RealEstate realEstate) {
		int count = realEstateRepository.insertRealEstateByEntity(realEstate);
		return count;
	}
}

