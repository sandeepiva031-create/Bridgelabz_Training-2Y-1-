package Recursion;

public class Factorial {

   public static int fact(int n) {

       if(n==0){
           return 1;
       }
       int s=fact(n-1);
        return s*n;
    }

    public static int sum(int n){
       if(n==1){
           return 1;
       }
       int s= sum(n-1);
       return s+n;
    }

    static void main(String[] args) {
        System.out.println("Factorial :- "+fact(5));
        System.out.println("Sum :- "+sum(5));
    }
}
