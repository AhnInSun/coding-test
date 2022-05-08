package net.acmicpc.step;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Loop {
    
    public static void nStarReverse() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = n-1; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void nStar() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void abPlusWithCaseFormula() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b;
        for (int i = 1; i <= t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(String.format("Case #%d: %d + %d = %d", i, a, b, a+b));
        }
    }
    
    public static void abPlusWithCase() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b;
        for (int i = 1; i <= t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(String.format("Case #%d: %d", i, a+b));
        }
    }
    
    public static void NToOne() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
    
    public static void oneToN() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void nSumFast() {
        int t, a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                bw.write(a + b + "\n");
            }
            bw.flush();
            br.close();
            bw.close();
        } catch (Exception e) {

        }
    }

    public static void nSum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;

        for (int i = 1; i <= n; i++) {
            r += i;
        }
        System.out.println(r);
    }

    public static void abPlus() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b;
        String r = "";

        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            r += a + b + "\n";
        }

        System.out.println(r);
    }

    public static void timesTable() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= 9 ; i++) {
            System.out.println(String.format("%d * %d = %d", a, i, a*i));
        }
    }
}
