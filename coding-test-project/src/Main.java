import com.codility.app.PrefixSums;

public class Main {
	public static void main(String[] args) {
		
		String S ="CAGCCTA";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
		
		// expected : [2,4,1]
		int[] rtnArr = PrefixSums.GenomicRangeQuery(S, P, Q);
		
		for (int i = 0; i < rtnArr.length; i++) {
			System.out.println(rtnArr[i]);
		}

		// PC > 인텔리j에서 수정.
		// Mac > 인텔리j에서 수정.
	}
}
