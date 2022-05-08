package net.acmicpc.step;
import java.util.Scanner;

public class Conditional {
    public static void CalcWinMoney() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int win_money = 0;

        if(a == b && a == c) {
            win_money = 10000 + a * 1000;
        } else if(a == b || a == c || b == c) {
            if(b==c)
                win_money = 1000 + b * 100;
            else
                win_money = 1000 + a * 100;
        } else {
            if(a >= b && a >= c)
                win_money = a * 100;
            else if(b >= a && b >= c)
                win_money = b * 100;
            else
                win_money = c * 100;
        }
        System.out.println(win_money);
    }

    public static void getCookingTime() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int r = m + c;

        // 오븐 종료시간 구하기
        if(r < 60) {
            m = r;
        } else if(r >= 60) {
            h = h + (r/60);
            if(h >= 24) {
                h = h%24;
            }
            m = m + (c%60);
            if(m >= 60) {
                m = m%60;
            }
        }

        System.out.println(h + " " + m);
    }

    public static void getQuadrant() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int quadrant = 0;
        if(a > 0 && b > 0)
            quadrant = 1;
        else if(a < 0 && b > 0)
            quadrant = 2;
        else if(a < 0 && b < 0)
            quadrant = 3;
        else
            quadrant = 4;
        System.out.println(quadrant);
    }

    public static void isLeapYear() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int isYear = 0;
        if(year%4 == 0 && (year%100 != 0 || year%400 == 0)) {
            isYear = 1;
        }
        System.out.println(isYear);
    }

    public static void getGrade() {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String grade = "";
        if(score >= 90)
            grade = "A";
        else if(score >= 80)
            grade = "B";
        else if(score >= 70)
            grade = "C";
        else if(score >= 60)
            grade = "D";
        else
            grade = "F";
        System.out.println(grade);
    }

    public static void preAlarm() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m >= 45) { // 45분보다
            System.out.println(h + " " + (m - 45));
        } else if (h == 0) { // 자정인 경우
            System.out.println(23 + " " + (60 - (45 - m)));
        } else { // 45분보다 작은 경우
            System.out.println((h - 1) + " " + (60 - (45 - m)));
        }
    }

    public static void compareValues() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b) System.out.println(">");
        if(a < b) System.out.println("<");
        if(a == b) System.out.println("==");
    }
}
