package String;

public class StringReverse {
    static void reverse(String s , int index) {

        if(index==s.length()){
            return;
        }
        reverse(s,index+1);
        System.out.print(s.charAt(index));
    }

    static void main() {

        reverse("leetcode",0);
    }
}
