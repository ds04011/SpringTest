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
		// 10/8 : 1 : 0.1

		/* 
		 * 1. 일단 다 생산
		 * 2. 남은거를, 가루로 바꿔서, 먼저 부족해진 재료로 충당, 
		 * 3. 다시 생산
		 * 4. 생산 불능시 2번 로직 다시
		 * 근데 이러면, 불필요한 연산이 너무 많아지지않나 싶은거지, 
		 *  그러니까, 모든 재료를 일반목재의 비율로 생각하고, 그 비율만 맞추는걸로 해보자 
		 *  
		
		  
		  반복문으로 로직을 타서 변환, 생산, 변환 생산, 이게 맞는거같다. 
			1. 11000 / 86  ,    3000 / 33 최소값
			2. 최소단위 생산
			3. 남은재료 조금씩 변환 진행
			4. 최소 생산 가능한지 확인 
			5. 되면 생산 , 아니면 다시 변환
			6, 위 반복.
		  
		*/
		
		
		
		
		
		
		int t3Unit = t3 / 5;	// 튼목 거래단위 
		//t1 = t1 + t3Unit * 50;	// 목재 환산
		
		int t1count= t1 / 86 ;
		int t2count = t2 / 45 ;
		int t4count = t4 / 33 ;
		
		int firstProd = maxTriple(t1count, t2count, t4count);
		
		t1 = t1 - 86 * firstProd;
		t2 = t2 - 45 * firstProd;
		t4 = t4 - 33 * firstProd;
		
				
		
		
		
		return "";
	}
	
	
	public static int maxTriple(int a, int b, int c) {
		
		int max = a > b ? a : b;
		max = max > c ? max : c;
		return max;
	}
}
