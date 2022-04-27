package net.acmicpc.step;

import java.util.Scanner;

public class IOnSimpleMath {

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
