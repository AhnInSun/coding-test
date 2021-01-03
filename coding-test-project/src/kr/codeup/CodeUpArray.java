package kr.codeup;

public class CodeUpArray {



    // 2차원 배열 빗금 채우기 3-1
    public static int[][] array3_1(int n, int m) {

        int[][] rtnArr = new int[n][m];
        int cnt = 1;

        for (int i = 0; i < n+m-1; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if (j + k == i) {
                        rtnArr[k][j] = cnt++;
                        break;
                    }
                }
            }
        }
        return rtnArr;
    }

}
