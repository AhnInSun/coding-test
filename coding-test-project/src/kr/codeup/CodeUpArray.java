package kr.codeup;

public class CodeUpArray {

    // 2차원 배열 빗금 채우기 3-2
    public static int[][] array3_2(int n, int m) {

        /*
            1 2 4 7 11
            3 5 8 12 15
            6 9 13 16 18
            10 14 17 19 20
        */

        int[][] rtnArr = new int[n][m];
        int cnt = 1;

        for (int i = 0; i < n+m-1; i++) {
            for (int j = m - 1; j >= 0; j--) {
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

    // 2차원 배열 빗금 채우기 3-1
    public static int[][] array3_1(int n, int m) {

        /*
            1 3 6 10 14
            2 5 9 13 17
            4 8 12 16 19
            7 11 15 18 20
        */

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
