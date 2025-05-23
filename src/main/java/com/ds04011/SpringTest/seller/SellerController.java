package com.ds04011.SpringTest.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ds04011.SpringTest.seller.service.SellerService;

@Controller
public class SellerController {

	@Autowired
	private SellerService sellerService;
	
	@RequestMapping("/seller/addpage")
	public String addSeller() {
		
		return "seller/selleradd";
	}
	
	@PostMapping("/seller/add")
	public String sellerAdd(@RequestParam("nickname") String nickname, 
			@RequestParam("url") String url,
			@RequestParam("temperature") double temperature) {
		
		sellerService.addSeller(nickname, url, temperature);
		
		return "";
	}
}
