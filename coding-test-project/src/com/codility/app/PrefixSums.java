package com.codility.app;

public class PrefixSums {
	
	public static int[] GenomicRangeQuery(String S, int[] P, int[] Q) {
		
		// A,C,G,T�� ���� impact factor 1,2,3,4�� ����.
		// S = "CAGCCTA" 
		// P[0]=2, Q[0]=4�� ��� CAGCCTA ���ڿ��� 2��° 4��° ���ڿ��� ����Ŵ
		// ��� ���ڿ� ������ impact factor�� �� ���� ���� ���� ã�ƾ� ��.
		// CAGCCTA �� ���ڿ��� 2��° 4��° GCC�� �ּ� impact factor�� C�� �� 2.
		// �ּ� impact factor ���� �迭�� ���� ����.
		
		int[] rtnArr = {1,2,3};
		
		
		return rtnArr;
	}
}
