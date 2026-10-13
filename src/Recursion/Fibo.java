package Recursion;

import java.sql.SQLOutput;

public class Fibo {

    public static int fibbo(int n){
        if(n==0 || n==1){
            return n;
        }
        int small1 = fibbo(n-1);
        int small2=  fibbo(n-2);
        return small1+small2;
    }

    static void main(String[] args) {
        System.out.println(fibbo(5));

    }
}
