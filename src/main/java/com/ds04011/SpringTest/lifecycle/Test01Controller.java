package com.ds04011.SpringTest.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lifecycle/test01")
public class Test01Controller {
	
	@RequestMapping("/1")
	@ResponseBody
	public String startboot() {
		return ""
				+ "<html>\n"
				+ "	<head><title>냠냠</title></head>\n"
				+ "	<body>\n"
				+ "		<h2>테스트 준비 완료, </h2>\n"
				+ "		테스트 풀이용 스프링 완료\n"
				+ "</body>\n"
				+ "</html>";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Integer> mapResponse(){
		Map<String , Integer> scoreMap = new HashMap<>();
		
		scoreMap.put("국어", 80);
		scoreMap.put("수학", 95);
		scoreMap.put("영어", 90);
		
		return scoreMap;
	}
	
	

}
