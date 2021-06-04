package kr.codeup;

public class CodeUpArray {

    // 2차원 배열 빗금 채우기 3-7
    public static int[][] array3_7(int n, int m) {

        int[][] rtnArr = new int[100][100];
        int cnt = 1;

        /*

         */

        for (int i = (n+m); i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                for (int k = m-1; k >= 0; k--) {
                    if ((j-k+m) == i) {
                        rtnArr[j][k] = cnt++;
                    }
                }
            }
        }

        return rtnArr;
    }

    // 2차원 배열 빗금 채우기 3-6
    public static int[][] array3_6(int n, int m) {

        int[][] rtnArr = new int[n][m];
        int cnt = 1;

        /*
            12 11 9 6
            10 8 5 3
            7 4 2 1

            0 23
            1 22, 13
            2 21, 12, 03
            3 20, 11, 02
            4 10, 01
            5 00
        */

        for (int i = 0; i < n+m-1; i++) {
            for (int j = n-1; j >= 0; j--) {
                for (int k = 0; k < m; k++) {
                    if ((j+k) == (n+m-2-i)) {
                        rtnArr[j][k] = cnt++;
                    }
                }
            }
        }

        return rtnArr;
    }


    // 2차원 배열 빗금 채우기 3-5
    public static int[][] array3_5(int n, int m) {

        int[][] rtnArr = new int[n][m];
        int cnt = 1;

        /*
            12 10 7 4
            11 8 5 2
            9 6 3 1

            0 23
            1 13, 22
            2 03, 12, 21
            3 02, 11, 20
            4 01, 10
            5 00
        */

        for (int i = 0; i < n+m-1; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if ((j+k) == (n+m-2-i)) {
                        rtnArr[j][k] = cnt++;
                    }
                }
            }
        }

        return rtnArr;
    }

    // 2차원 배열 빗금 채우기 3-4
    public static int[][] array3_4(int n, int m) {

        int[][] rtnArr = new int[n][m];
        int cnt = 1;

        /*
           9 6 3 1
           11 8 5 2
           12 10 7 4
        */
        /*
            00 01 02 03
            10 11 12 13
            20 21 22 23
            30 31 32 34
        */

        for (int i = 0; i < n+m-1; i++) {
            for (int j = n-1; j >= 0; j--) {
                for (int k = 0; k < m; k++) {
                    if (j + (m - 1 - k) == i) {
                        //System.out.print("i:"+i+", rtnArr["+j+"]["+k+"]=");
                        //System.out.println(rtnArr[j][k] + " $");
                        rtnArr[j][k] = cnt++;
                    }
                }
            }
        }

        return rtnArr;
    }


    // 2차원 배열 빗금 채우기 3-3
    public static int[][] array3_3(int n, int m) {

        int[][] rtnArr = new int[n][m];
        int cnt = 1;

        /*
            00 01
            10 11
            20 21
            30 31
        */

        for (int i = 0; i < n+m-1 ; i++) {
            for (int j = 0; j < n; j++) {
                //제일 오른쪽 열부터 시작한다.
                for (int k = m-1; k >= 0; k--) {
                    // 규칙을 찾으면 m-1-k+i를 하면 규칙적인 합이 나온다.
                    if (j + (m-1-k) == i) {
                        rtnArr[j][k] = cnt++;
                       // System.out.println("rtnArr["+j+"]["+k+"]=" + rtnArr[j][k] + " $");
                    }else{
                       // System.out.println("rtnArr["+j+"]["+k+"]=" + rtnArr[j][k]);
                    }
                }
            }
        }

        return rtnArr;
    }

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
