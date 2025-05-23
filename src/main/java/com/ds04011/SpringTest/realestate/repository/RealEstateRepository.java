package com.ds04011.SpringTest.realestate.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ds04011.SpringTest.realestate.domain.RealEstate;

@Mapper
public interface RealEstateRepository {
	public RealEstate getRealEstateById(@Param("id") int id);
	
	public List<RealEstate> getRealEstateByPriceLimit(@Param("rentprice") int rentprice);
	
	public List<RealEstate> getRealEstateByAreaPrice(@Param("area")int area, 
			@Param("price") int price);
	
	public int insertRealEstate(@Param("realtorId") int realtorId
			, @Param("address") String addresss
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price
			, @Param("rentPrice") int rentPrice);
	
	public int insertRealEstateByEntity(RealEstate realEstate);
	
	public int updateRealEstate(@Param("id")int id, @Param("type") String type, @Param("price") int price);
	
	public int deleteRealEstate(@Param("id") int id);
}

