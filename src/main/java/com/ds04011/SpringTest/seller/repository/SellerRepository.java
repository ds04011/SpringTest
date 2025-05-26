package com.ds04011.SpringTest.seller.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ds04011.SpringTest.seller.domain.Seller;

@Mapper
public interface SellerRepository {
	
	public List<Seller> getSellers();
	
	public int addSeller(@Param("nickname") String nickname,
			@Param("url") String url,
			@Param("temperature") double temperature);

	
	public Seller getLastSeller();
	public Seller getSellerById(@Param("id") int id);
	
}
