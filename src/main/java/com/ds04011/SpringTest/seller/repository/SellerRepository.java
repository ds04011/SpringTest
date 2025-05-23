package com.ds04011.SpringTest.seller.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SellerRepository {
	
	public int addSeller(@Param("nickname") String nickname,
			@Param("url") String url,
			@Param("temperature") double temperature);

}
