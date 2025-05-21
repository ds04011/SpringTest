package com.ds04011.SpringTest.store.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ds04011.SpringTest.store.domain.Store;

@Mapper
public interface StoreRepository {
	
	public List<Store> selectStoreList();
	
}
