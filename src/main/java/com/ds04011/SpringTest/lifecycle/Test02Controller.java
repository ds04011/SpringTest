package com.ds04011.SpringTest.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycle/test02")
public class Test02Controller {
	
	
	@RequestMapping("/1")
	public List<Map<String, Object>> listMapResponse(){
		List<Map<String, Object>> mapList = new ArrayList<>();
		
		
		Map<String, Object> dataMap = new HashMap<>();
		dataMap.put("rate", 15);
		dataMap.put("director", "봉준호");
		dataMap.put("time", 131);
		dataMap.put("title", "기생충");
		mapList.add(dataMap);
		
		dataMap = new HashMap<>();
		dataMap.put("rate", 2);
		dataMap.put("director", "Robert");
		dataMap.put("time", 116);
		dataMap.put("title", "life is beauty");
		mapList.add(dataMap);
		
		dataMap = new HashMap<>();
		dataMap.put("rate", 12);
		dataMap.put("director", "Christoper");
		dataMap.put("time", 147);
		dataMap.put("title", "Inception");
		mapList.add(dataMap);
		
		dataMap = new HashMap<>();
		dataMap.put("rate", 19);
		dataMap.put("director", "Yoon jong");
		dataMap.put("time", 133);
		dataMap.put("title", "나쁜놈들 전성시대");
		mapList.add(dataMap);
		
		dataMap = new HashMap<>();
		dataMap.put("rate", 15);
		dataMap.put("director", "프란시스 로랜르");
		dataMap.put("time", 137);
		dataMap.put("title", "헝거게임");
		mapList.add(dataMap);
		
		return mapList;
	}
	
}
