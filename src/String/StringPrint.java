package String;



public class StringPrint {

    static void print(String name , int index) {

     if(index==name.length()){
         return;
     }
        System.out.print(name.charAt(index));
     print(name,index+1);

    }

    static void main(String[] args) {

        print("Sandyy",0);
    }
}
