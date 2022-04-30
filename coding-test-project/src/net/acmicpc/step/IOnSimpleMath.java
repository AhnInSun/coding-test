package net.acmicpc.step;

import java.util.Scanner;

public class IOnSimpleMath {

    
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

    public static void printMultiplication() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int n = Integer.parseInt(a);
        int m = Integer.parseInt(b);

        System.out.println(n*(m%10));
        System.out.println(n*(m%100/10));
        System.out.println(n*(m%1000/100));
        System.out.println(n*m);
    }

    public static void printMath() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }

    public static void convertYear(int year) {
        System.out.println(year - 543);
    }

    public static void chkId(String id) {
        System.out.println(id + "??!");
    }

    public static void printSimpleMath(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    // a / b
    public static void division() {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double m = sc.nextInt();
        System.out.println(String.format("%.9f", n/m));
    }

    // print cat
    public static String getCat() {
        /*

        "\    /\"
        " )  ( ')"
        "(  /  )"
        " \(__)|"
        */

        StringBuilder cat = new StringBuilder();
        cat.append("\\    /\\\n");
        cat.append(" )  ( ')\n");
        cat.append("(  /  )\n");
        cat.append(" \\(__)|\n");
        return cat.toString();
    }
}
