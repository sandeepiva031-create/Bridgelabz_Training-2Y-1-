package Recursion;

public class GCD {

    private static String[] args;

    static int gcd(int x , int y) {
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }

    static void main(String[] args) {

        System.out.println(gcd(12,16));

    }
}
