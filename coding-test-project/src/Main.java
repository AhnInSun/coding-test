import kr.codeup.CodeUpArray;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//int n = sc.nextInt();
		//int m = sc.nextInt();

		int n = 4;
		int m = 2;

		int[][] rtnArr = CodeUpArray.array3_4(n, m);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(rtnArr[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
