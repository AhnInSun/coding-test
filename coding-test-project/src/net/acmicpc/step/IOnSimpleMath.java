package net.acmicpc.step;

import java.util.Scanner;

public class IOnSimpleMath {

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
