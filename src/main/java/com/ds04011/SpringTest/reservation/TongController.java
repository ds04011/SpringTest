package com.ds04011.SpringTest.reservation;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringTest.reservation.domain.Tong;
import com.ds04011.SpringTest.reservation.service.TongService;

@Controller
public class TongController {
	
	@Autowired
	private TongService tongService; 
	
	@GetMapping("/tong/mainpage")
	public String mainPage() {
		
		return "reservation/mainpage";
	}
	
	@GetMapping("/tong/reservationlist")
	public String reservationlist(Model model) {
		
		List<Tong> list1 = tongService.getReservationList();
		model.addAttribute("result", list1);
		
		return "reservation/list";
	}
	
	@GetMapping("/tong/reservationpage")
	public String reservationpage() {
		return "reservation/reservation";
	}
	
	@PostMapping("/tong/reservate")
	@ResponseBody
	public Map<String, String> reservate(@RequestParam("name") String name
			 , @DateTimeFormat(pattern="yyyy년 M월 d일") @RequestParam("date") LocalDate date  //날짜 입력받는거 수정 필요
			 , @RequestParam("day") int day
			 , @RequestParam("headcount") int headcount
			 , @RequestParam("phoneNumber") String phoneNumber) {
		
		Tong tong1 = new Tong();
		tong1.setDate(date);
		tong1.setDay(day);
		tong1.setHeadcount(headcount);
		tong1.setName(name);
		tong1.setPhoneNumber(phoneNumber);
		tong1.setState("대기중");
		
		
		
		int count = tongService.addReservation(tong1);
		
		Map<String, String> map1 = new HashMap<>();
		String result = "fail";
		if(count ==1) {
			result="success";
		}
		map1.put("result", result);
		
		
		return map1;
	}
	
	@ResponseBody
	@GetMapping("/tong/delete")
	public Map<String, String> reservationDelete(@RequestParam("id") int id) {
		
		
		int count = tongService.deleteReservation(id);
		
		
		Map<String, String> map1 = new HashMap<>();
		String result = "fail";
		if(count ==1) {
			result="success";
		}
		map1.put("result", result);
		
		
		return map1;
	}
	
	
	@ResponseBody
	@PostMapping("/tong/check")
	public Map<String, Object> reservationCheck(@RequestParam("name") String name
	, @RequestParam("phoneNumber") String phoneNumber){
		
		Tong t1 = tongService.checkReservation(name, phoneNumber);
		
		Map<String, Object> map1 = new HashMap<>();
		map1.put("id", t1.getId());
		map1.put("name", t1.getName());
		map1.put("date", t1.getDate());
		map1.put("day", t1.getDay());
		map1.put("headcount", t1.getHeadcount());
		map1.put("state",  t1.getState());
		
		return map1;
		
		
	}
	
	
	
	
	

}
