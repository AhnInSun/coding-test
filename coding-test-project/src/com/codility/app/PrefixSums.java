package com.codility.app;

public class PrefixSums {
	
	
	public static int MinAvgTwoSlice(int[] A) {
		
		// 배열의 모든 조합(P부터 Q까지, 0 <= P < Q)의 평균값에 대해서 최소 평균값을 갖는 P를 찾는 문제이다.
		// A:{4,2,2,5,1,5,8} => 1
		// (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).
		
		// 결론적으로 2가지 케이스만 고려하면 된다. slice가 2개 또는 3개인 경우이다. 
		// 평균의 성질로 부분집합의 평균은 가장 작은 인자보다 항상 크다. 즉, (1, 2)의 평균은 1.5이므로 1보다 크다는 의미이다.
        // 평균들의 평균은 각 인자들의 평균과 같다. 
		// 즉, (1, 2, 3, 4)가 있을 때, (1, 2, 3, 4) = 2.5이고 (1, 2) = 1.5, (3, 4) = 3.5 일 때 (1.5, 3.5) = 2.5가 된다는 의미이다.
		
		float minAvg = (A[0] + A[1]) / 2f;
		
	    int minIndex = 0;
	    
	    for (int i = 2; i < A.length; i++) {
	        float avg = (A[i - 2] + A[i - 1] + A[i]) / 3f;
	        if (minAvg > avg) {
	            minAvg = avg;
	            minIndex = i - 2;
	        }

	        avg = (A[i - 1] + A[i]) / 2f;
	        if (minAvg > avg) {
	            minAvg = avg;
	            minIndex = i - 1;
	        }
	    }
	    
	    return minIndex;
		
	}
	
	public static int[] GenomicRangeQuery(String S, int[] P, int[] Q) {
			
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
