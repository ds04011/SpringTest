package com.ds04011.SpringTest.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringTest.store.domain.Store;
import com.ds04011.SpringTest.store.repository.StoreRepository;

@Service
public class StoreService {
	
	@Autowired
	private StoreRepository storeRepository;
	
	
	public List<Store> getStoreList() {
		List<Store> storeList = storeRepository.selectStoreList();
		
		return storeList;
	}

}
