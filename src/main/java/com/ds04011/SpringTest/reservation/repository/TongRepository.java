package com.ds04011.SpringTest.reservation.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ds04011.SpringTest.reservation.domain.Tong;

@Mapper
public interface TongRepository {
	
	public List<Tong> selectAllBooking();
	
	public int insertBooking(Tong tong);
	
	public int deleteBooking(@Param("id") int id);
	
	public Tong selectByNameandPhoneNumber(@Param("name") String name, @Param("phoneNumber") String phoneNumber);
	
}
