package String;

public class RevSentence {
    static void main(String[] args) {
       String s= " i am student";

       StringBuilder str = new StringBuilder("");
       String ans = " ";
       for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);

           if(ch!=' '){
               str.append(ch);
           }else{
               str.reverse();
               ans+=str;
               ans+=" ";
               str=new StringBuilder();
           }
       }
       str.reverse();
       ans+=str;
        System.out.println(ans);
    }

}



