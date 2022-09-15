package net.acmicpc.step;
import java.util.Scanner;

public class StringStep {

    private static Scanner sc = new Scanner(System.in);
    // aaa : 1
    // aba : 0
    public static void gwChkr() {
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if(gwChk()){
                answer++;
            }
        }
        System.out.print(answer);
    }

    public static boolean gwChk() {

        boolean[] chk = new boolean[26];
        String w = sc.next();
        int prev = 0;
        int now = 0;

        for (int i = 0; i < w.length(); i++) {
            now = w.charAt(i);
            if(prev != now) {
                if(chk[now - 'a'] == false) {
                    chk[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }

        return true;
    }
}
