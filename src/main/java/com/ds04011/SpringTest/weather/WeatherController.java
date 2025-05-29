package com.ds04011.SpringTest.weather;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
