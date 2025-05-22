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
@RequestMapping("/realestate")
public class RealEstateController {

	@Autowired
	private RealEstateService realEstateService;
	
	@RequestMapping("/id")
	@ResponseBody
	public RealEstate getRealEstateById(@RequestParam("id") int id) {
		RealEstate e1 = realEstateService.getRealEstateById(id);
		return e1;
	}
	
	@RequestMapping("/rentprice")
	@ResponseBody
	public List<RealEstate> getRealEstateByPriceLimit(@RequestParam("rentprice") int rentprice) {
		List<RealEstate> e1 = realEstateService.getRealEstateByPriceLimit(rentprice);
		return e1;
	}
	
	@RequestMapping("/areaprice")
	@ResponseBody
	public List<RealEstate> getRealEstateByAreaPrice(@RequestParam("area") int area,  
			@RequestParam("price") int price){
		
		
		return realEstateService.getRealEstateByAreaPrice(area, price);
	}
	
	@RequestMapping("/create/manual")
	@ResponseBody
	public String addRealEstate() {
		int count = realEstateService.addRealEstate(3, "푸르지용 리버 303동 1104호", 89, "매매", 100000, 0);
		return "실행결과 : " + count;
	}
	
	@RequestMapping("/create/entity")
	@ResponseBody
	public String addRealEstateByEntity(@RequestParam("realtorId") int realtorId) {
		
		RealEstate r1 = new RealEstate();
		r1.setRealtorId(realtorId);
		r1.setAddress("썅떼빌리버 오피스텔 814호");
		r1.setArea(45);
		r1.setType("월세");
		r1.setPrice(100000);
		r1.setRentPrice(120);
		
		
		int count = realEstateService.addRealEstateByEntity(r1);
		return "실행결과 : " + count;
	}
	
	
}
