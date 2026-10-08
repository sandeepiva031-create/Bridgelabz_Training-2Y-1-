package Arrays.Logical_Building;

public class methods2 {

    public static void fun1(){
        int x=1;
        fun2();
        System.out.println(x);
    }
    public static void fun2(){
        int x=2;
        fun3();
        System.out.println(x);
    }
    public static void fun3(){
        int x=3;
        System.out.println(x);
    }

    static void main(String[] args) {
        fun1();
    }
}
