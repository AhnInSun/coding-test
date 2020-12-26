package com.codility.app;

public class PrefixSums {
	
	public static int[] GenomicRangeQuery(String S, int[] P, int[] Q) {
		
		/*
		String S ="CAGCCTA";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
		
		// expected : [2,4,1]
		int[] rtnArr = PrefixSums.GenomicRangeQuery(S, P, Q);
		*/
		
		int[] rtnArr = new int[P.length];
		
		int[] A = new int[S.length()+1];
		int[] C = new int[S.length()+1];
		int[] G = new int[S.length()+1];

		for (int i = 0; i < S.length(); i++) {
			A[i+1] = A[i];
			C[i+1] = C[i];
			G[i+1] = G[i];
			
			if(S.charAt(i)=='A') A[i+1]++;
			else if(S.charAt(i)=='C') C[i+1]++;
			else if(S.charAt(i)=='G') G[i+1]++;
		}
		
		for (int i = 0; i < P.length; i++) {
			if(A[P[i]] != A[Q[i]+1]) rtnArr[i] = 1;
			else if(C[P[i]] != C[Q[i]+1]) rtnArr[i] = 2;
			else if(G[P[i]] != G[Q[i]+1]) rtnArr[i] = 3;
			else rtnArr[i] = 4;
		}
		
		return rtnArr;
	}
}
