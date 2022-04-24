package kr.codeup;

public class CodeUpArray {


    // 2차원 배열 달팽이 채우기 4-1
    public static int[][] array4_1(int n, int m) {
        int[][] arr = new int[n][m];
        int cnt = 1;

        /*
            1 2 3 4 5
            14 15 16 17 6
            13 20 19 18 7
            12 11 10 9 8

            00 01 02 03
            10 11 12 13
            20 21 22 23

            0: 00, 01, 02, 03
                1: 13, 23
            2: 22, 21, 20
                3: 10
            4: 11, 12

            00 01 02 03 04 05
            10 11 12 13 14 15
            20 21 22 23 24 25
            30 31 32 33 34 35
            40 41 42 43 44 45

            0: 00, 01, 02, 03, 04 05     0
                1: 15, 25, 35, 45
                2: 44, 43, 42, 41, 40        1
                3: 30, 20, 10
            4: 11, 12, 13, 14            2
                5: 24, 34
                6: 33, 32, 31                3
                7: 21
            8: 22, 23                    4
        */

        int jsi = 0;
        for (int i = 0; i < n+m-2; i++){

            if (i%2 == 0)
                for (int j = 0; j < m-1; j++) {
                    if(j%2 == 0)
                        for (int k = jsi; k < m-j; k++)
                            arr[j][k] = cnt++;
                }
        }

        return arr;
    }

    // 2차원 배열 빗금 채우기 3-8
    public static int[][] array3_8(int n, int m) {

        /*
            4 7 10 12
            2 5 8 11
            1 3 6 9

            7 11 15 18 20
            4 8 12 16 19
            2 5 9 13 17
            1 3 6 10 14

            00 01 02 03 04
            10 11 12 13 14
            20 21 22 23 24
            30 31 32 33 34

            0: 30
            1: 20, 31
            2: 10, 21, 32
            3: 00, 11, 22, 33
            4: 01, 12, 23, 34
            5: 02, 13, 24
            6: 03, 14
            7: 04
        */

        int[][] arr = new int[n][m];
        int cnt = 1;

        for (int i = 0; i < n+m-1; i++) {
            for (int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    if(n-(j+1) == i-k){
                        arr[j][k] = cnt++;
                    }
                }
            }
        }

        return arr;
    }

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
