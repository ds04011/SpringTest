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
	
	public List<RealEstate> getRealEstateByPriceLimit(int price) {
		return realEstateRepository.getRealEstateByPriceLimit(price);
	}

}
