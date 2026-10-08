package String;

public class StringPalindrome {
    static void main(String[] args) {
           String s = "LeeL";

          StringBuilder str=new StringBuilder(s);
          String ans="";
          str.reverse();
          ans+=str;
          if(s.equals(ans)){
              System.out.println("pelindrome");
          }else{
        System.out.println("not a pelindrome");}
    }
}
