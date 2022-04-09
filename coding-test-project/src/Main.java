import kr.codeup.CodeUpArray;
import kr.codeup.CodeUpDynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static kr.codeup.CodeUpArray.array3_8;

public class Main {
	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//int m = sc.nextInt();

		int n = 4;
		int m = 5;

		int[][] rtnArr = array3_8(n, m);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(rtnArr[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
