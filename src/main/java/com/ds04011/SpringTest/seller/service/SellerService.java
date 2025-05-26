package com.ds04011.SpringTest.seller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringTest.seller.domain.Seller;
import com.ds04011.SpringTest.seller.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	public List<Seller> getSellers(){
		return sellerRepository.getSellers();
	}
	
	public int addSeller(String nickname, String url, double temperature) {
		int count = sellerRepository.addSeller(nickname, url, temperature);
		return count;
	}
	
	public Seller getLastSeller() {
		
		Seller s1 = sellerRepository.getLastSeller();
		
		return s1;
	}
	
	public Seller getSellerById(int id) {
		Seller seller = sellerRepository.getSellerById(id);
		return seller;
				
	}
}
