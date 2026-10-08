package Arrays.Logical_Building;

public class Methods {

    // method 1 its type is int so it return
    public static int add(int a , int b){
        return a+b;
    }
    // method 2 its type is void so it does
    // not return instead is print inside methods
    public static void mul(int a, int b){

        System.out.println(a*b);
    }


    static void main(String[] args) {
        int result = add(20,30);
        System.out.println(result);
        mul(20,30);
    }
}
