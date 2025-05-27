package com.ds04011.SpringTest.realtor.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ds04011.SpringTest.realtor.domain.Realtor;

@Mapper
public interface RealtorRepository {
	
	public int addRealtor(Realtor realtor);  //@Param("realtor") realtor 이런식으로 받으면, 
											// 객체 realtor가 아니라 변수명 realtor 가 되버림. 

}
