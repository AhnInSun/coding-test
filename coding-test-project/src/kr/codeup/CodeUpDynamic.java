package kr.codeup;

public class CodeUpDynamic {
    public static int fibo(int n){
        if(n==0 || n==1) return 1;
        return fibo(n-1) + fibo(n-2);
    }
}
