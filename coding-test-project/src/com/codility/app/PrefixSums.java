package com.codility.app;

public class PrefixSums {
	
	public static int[] GenomicRangeQuery(String S, int[] P, int[] Q) {
		
		// A,C,G,T는 각각 impact factor 1,2,3,4를 갖음.
		// S = "CAGCCTA" 
		// P[0]=2, Q[0]=4인 경우 CAGCCTA 문자열의 2번째 4번째 문자열을 가르킴
		// 상기 문자열 사이의 impact factor값 중 가작 작은 값을 찾아야 함.
		// CAGCCTA 의 문자열의 2번째 4번째 GCC의 최소 impact factor는 C의 값 2.
		// 최소 impact factor 들의 배열을 최종 리턴.
		
		int[] rtnArr = {1,2,3};
		
		
		return rtnArr;
	}
}
