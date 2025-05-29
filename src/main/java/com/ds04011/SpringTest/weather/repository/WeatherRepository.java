package com.ds04011.SpringTest.weather.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ds04011.SpringTest.weather.domain.Weather;

@Mapper
public interface WeatherRepository {

	public List<Weather> getWeatherList();
}
