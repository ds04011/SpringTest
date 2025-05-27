package com.ds04011.SpringTest.realtor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringTest.realtor.domain.Realtor;
import com.ds04011.SpringTest.realtor.repository.RealtorRepository;

@Service
public class RealtorService {
	
	@Autowired
	private RealtorRepository realtorRepository;
	
	public int addRealtor(Realtor realtor) {
		
		int count = realtorRepository.addRealtor(realtor);
		return count;
	}

}
