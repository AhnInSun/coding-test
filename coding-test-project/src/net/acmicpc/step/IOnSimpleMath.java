package net.acmicpc.step;
import java.util.Scanner;

public class IOnSimpleMath {

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

    public static void printLeap() {
        System.out.println("         ,r'\"7\n" +
                "r`-_   ,'  ,/\n" +
                " \\. \". L_r'\n" +
                "   `~\\/\n" +
                "      |\n" +
                "      |");
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
