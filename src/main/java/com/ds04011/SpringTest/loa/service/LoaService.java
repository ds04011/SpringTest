package com.ds04011.SpringTest.loa.service;

import org.springframework.stereotype.Service;

@Service
public class LoaService {

	
	public String woodcal(int t1, int t2, int t3, int t4) {
		
//		86 : 45 : 0 : 33
//		부목	25 -> 50	목재
//		튼목	5 -> 50		목재
//		목재	100 -> 80	가루
//		가루	100 -> 10	아목		최적화 시켜야 하는데, 

		/* 
		 * 1. 일단 다 생산
		 * 2. 남은거를, 가루로 바꿔서, 먼저 부족해진 재료로 충당, 
		 * 3. 다시 생산
		 * 4. 생산 불능시 2번 로직 다시
		 * 근데 이러면, 불필요한 연산이 너무 많아지지않나 싶은거지, 
		 *  그러니까, 모든 재료를 일반목재의 비율로 생각하고, 그 비율만 맞추는걸로 해보자 
		 *  
		  
		*/
		int t3Unit = t3 / 5;	// 튼목 거래단위 
		t1 = t1 + t3Unit * 50; 
				
		
		
		
		return "";
	}
}
