package com.ds04011.SpringTest.seller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringTest.seller.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	public int addSeller(String nickname, String url, double temperature) {
		int count = sellerRepository.addSeller(nickname, url, temperature);
		return count;
	}
}
