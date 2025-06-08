package com.ds04011.SpringTest.weather;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ds04011.SpringTest.weather.domain.Weather;
import com.ds04011.SpringTest.weather.sevice.WeatherService;

@Controller
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	
	
	
	@GetMapping("/weather/weatherpage")
	public String weatherpage(Model model) {
		
		
		List<Weather> weatherList = weatherService.getWeatherList();
		
		model.addAttribute("result", weatherList);
		
		return"weather/weatherpage";
	}
	
	
	
	
	
	@GetMapping("/weather/input")
	public String weatherinput() {
		return "weather/weatherinput";
	}
	
	@PostMapping("/weather/input")
	public String weatherInput(
//			@DateTimeFormat(pattern="yyyy년 M월 d일") @RequestParam("date") LocalDate date
//			, @RequestParam("weather") String weather
//			, @RequestParam("temperatures") double temperatures
//			, @RequestParam("precipitation") double precipitation
//			, @RequestParam("microDust") String microDust
//			, @RequestParam("windSpeed") double windSpeed
			@ModelAttribute Weather w1) {
		
//		Weather w1 = new Weather();
//		w1.setDate(date);
//		w1.setWeather(weather);
//		w1.setTemperatures(temperatures);
//		w1.setPrecipitation(precipitation);
//		w1.setMicroDust(microDust);
//		w1.setWindSpeed(windSpeed);
		
		// model attribute 를 통해서 set 메서드로 일일이 저장하지 않고, 바로 객체 생성이 가능
		// 이렇게 만들어진 객체로 바로 메서드 사용가능. 
		
		int count = weatherService.addWeather(w1);
		
		
		
		
		return "redirect:/weather/weatherpage";
	}
	

}
