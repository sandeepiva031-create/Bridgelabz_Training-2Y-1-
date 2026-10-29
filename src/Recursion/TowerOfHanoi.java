package Recursion;

public class TowerOfHanoi {

    static void tower(int n , char source , char helper , char destination) {
        if(n==1){
            System.out.println("move disk " + n + " from "+source+" to "+destination);
            return;
        }

        tower(n-1,source ,destination,helper);
        System.out.println("move disk "+n+" from "+source+" to "+destination);
        tower(n-1,helper,source,destination);
    }

    static void main() {
        int n=3;
        tower(n,'A','B','c');
    }
}
