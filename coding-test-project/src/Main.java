import com.codility.app.PrefixSums;

public class Main {
	public static void main(String[] args) {
		
		String S ="";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
		
		// expected : [2,4,1]
		int[] rtnArr = PrefixSums.GenomicRangeQuery("ASDASD",P, Q);
		
		for (int i = 0; i < rtnArr.length; i++) {
			System.out.println(rtnArr[i]);
		}
	}
	
}
