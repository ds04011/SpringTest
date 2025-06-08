package com.ds04011.SpringTest.loa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringTest.loa.service.LoaService;

@Controller
public class LoaController {
	
	
	@Autowired
	private LoaService loaService;
	
	
	
	@GetMapping("/loa/woodcal")
	public String woodcalpage() {
		
		return "loa/woodcalpage";
	}
	
	

	
	@PostMapping("/loa/woodcalresult")
	public String woodcalresult(@RequestParam("t1") int t1
			, @RequestParam("t2") int t2
			, @RequestParam("t3") int t3
			, @RequestParam("t4") int t4) {
		
		loaService.woodcal(t1, t2, t3, t4);
		
		return "";  // 이런 경우에, form 태그를 통해 넘어온 이후 다른 페이지를 구성해야, 
	}
	
	@ResponseBody
	@PostMapping("/loa/loawoodcal")
	public String woodcal(@RequestParam("t1") int t1
			, @RequestParam("t2") int t2
			, @RequestParam("t3") int t3
			, @RequestParam("t4") int t4) {
		
		
		
		return "";
	}
	
}
