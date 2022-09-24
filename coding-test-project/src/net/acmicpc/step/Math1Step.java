package net.acmicpc.step;

import java.util.Scanner;

public class Math1Step {
    private static Scanner sc = new Scanner(System.in);
    public static void p1712(){
        int a = sc.nextInt(); // 고정비
        int b = sc.nextInt(); // 생산비
        int c = sc.nextInt(); // 판매비

        if(b >= c) {
            System.out.print(-1);
            return;
        } else {
            System.out.print(a/(c-b)+1);
            /*int tot_cost = a + b;
            int tot_profit = c;
            int count = 1;
            while (true){
                if(tot_cost < tot_profit){
                    System.out.print(count);
                    return;
                }
                tot_cost += b;
                tot_profit += c;
                count++;
            }*/
        }
    }
}
