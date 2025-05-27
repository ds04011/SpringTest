package com.ds04011.SpringTest.realtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ds04011.SpringTest.realtor.domain.Realtor;
import com.ds04011.SpringTest.realtor.service.RealtorService;

@Controller
public class RealtorController {
	
	@Autowired
	private RealtorService realtorService;
	
	@RequestMapping("/realtor/addpage")
	public String realtorAddpage() {
		
		return "realtor/realtoradd";
	}
	
	@PostMapping("/realtor/add")
	public String realtorAdd(@RequestParam("office") String office
			, @RequestParam("phoneNumber") String phoneNumber
			, @RequestParam("address") String address
			, @RequestParam("grade") String grade
			, Model model) {
		
		Realtor realtor = new Realtor();
		realtor.setAddress(address);
		realtor.setGrade(grade);
		realtor.setOffice(office);
		realtor.setPhoneNumber(phoneNumber);
		
		realtorService.addRealtor(realtor);
		
		model.addAttribute("result", realtor);
		
		return "realtor/realtorinfo";
	}
	
	

}
