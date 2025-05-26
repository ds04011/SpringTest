package com.ds04011.SpringTest.seller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringTest.seller.domain.Seller;
import com.ds04011.SpringTest.seller.service.SellerService;

@Controller
public class SellerController {

	@Autowired
	private SellerService sellerService;
	
	
	@GetMapping("/seller/list")
	public String sellerList(Model model) {
		
		List<Seller> sellers = sellerService.getSellers();
		model.addAttribute("sellers", sellers);
		
		return "seller/sellerlist";
	}
	
	
	
	@RequestMapping("/seller/addpage")
	public String addSeller() {
		
		return "seller/selleradd";
	}
	
	@PostMapping("/seller/add")
	public String sellerAdd(@RequestParam("nickname") String nickname, 
			@RequestParam("url") String url,
			@RequestParam("temperature") double temperature) {
		
		int count = sellerService.addSeller(nickname, url, temperature);
		
		return "redirect:/seller/list"; // return 페이지를 잘못 입력 해놔서 서버 에러 500 이 발생해도, 메서드 자체는 
									// 정상 작동한거라, 이미 db 에 저장된것, 그래서 2개 저장됐다 ㅠ
	}
	
	@GetMapping("/seller/last")
	public String lastSeller(Model model) {
		
		Seller seller = sellerService.getLastSeller();
		model.addAttribute("seller", seller);
		
		
		return "seller/seller";
	}
	
	@GetMapping("/seller/id")
	public String getSellerById(@RequestParam("id") int id, Model model) {
		
		Seller seller = sellerService.getSellerById(id);
		model.addAttribute("seller", seller);
		
		
		return "seller/seller";
	}
	
	
	
}
