package Recursion;

public class Power {
    static int pow(int p,int q) {
        if(q==0){
            return 1;
        }
        int start=pow(p,q-1);
        return p*start;
    }

    static void main(String[] args) {
        System.out.println(pow(5,2));
    }
}
