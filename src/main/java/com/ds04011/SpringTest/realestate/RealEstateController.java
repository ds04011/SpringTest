package com.ds04011.SpringTest.realestate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringTest.realestate.domain.RealEstate;
import com.ds04011.SpringTest.realestate.service.RealEstateService;

@Controller
public class RealEstateController {

	@Autowired
	private RealEstateService realEstateService;
	
	@RequestMapping("/realestate/id")
	@ResponseBody
	public RealEstate getRealEstateById(@RequestParam("id") int id) {
		RealEstate e1 = realEstateService.getRealEstateById(id);
		return e1;
	}
	
	@RequestMapping("/realestate/pricelimit")
	@ResponseBody
	public List<RealEstate> getRealEstateByPriceLimit(@RequestParam("price") int price) {
		List<RealEstate> e1 = realEstateService.getRealEstateByPriceLimit(price);
		return e1;
	}
	
	
	
}
