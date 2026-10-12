package Recursion;

public class PrintNum {

    static void  print(int n) {

        if(n==1){
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    static void main(String[] args) {
        print(5);
    }
}
