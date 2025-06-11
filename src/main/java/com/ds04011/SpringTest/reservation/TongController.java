package com.ds04011.SpringTest.reservation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TongController {
	
	@GetMapping("/tong/mainpage")
	public String mainPage() {
		
		return "reservation/mainpage";
	}
	
	@GetMapping("/tong/reservationlist")
	public String reservationlist() {
		return "reservation/list";
	}
	
	@GetMapping("/tong/reservationpage")
	public String reservationpage() {
		return "reservation/reservation";
	}
	
	

}
