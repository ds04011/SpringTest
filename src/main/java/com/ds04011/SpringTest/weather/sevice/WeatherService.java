package com.ds04011.SpringTest.weather.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringTest.weather.domain.Weather;
import com.ds04011.SpringTest.weather.repository.WeatherRepository;

@Service
public class WeatherService {

	@Autowired
	private WeatherRepository weatherRepository;
	
	public List<Weather> getWeatherList(){
		
		return weatherRepository.getWeatherList();
	}
	
	public int addWeather(Weather weather) {
		
		return weatherRepository.addWeather(weather);
	}
}
