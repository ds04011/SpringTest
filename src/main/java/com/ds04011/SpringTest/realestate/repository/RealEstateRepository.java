package com.ds04011.SpringTest.realestate.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ds04011.SpringTest.realestate.domain.RealEstate;

@Mapper
public interface RealEstateRepository {
	public RealEstate getRealEstateById(@Param("id") int id);
	
	public List<RealEstate> getRealEstateByPriceLimit(@Param("price") int price);
}

