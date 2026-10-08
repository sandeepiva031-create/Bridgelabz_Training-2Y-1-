package String;

public class StringCount {
   public static void main(String[] args) {
       String s="aaabbbbccddde";
       String ans = "" +s.charAt(0);
       int count=1;
       for(int i=1;i<s.length();i++){
           char curr=s.charAt(i);
           char pre=s.charAt(i-1);

           if(curr==pre){
               count++;

           }else {
               ans += count;
               count = 1;
               ans += curr;
           }
           }
           ans+=count;
           System.out.println(ans);
    }
}
