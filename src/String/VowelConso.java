package String;

import java.sql.SQLOutput;

public class VowelConso {

        public static void main(String[] args) {
            String s = "aaabbbbccddde";

            int conso=0;
            int vowel=0;

            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);

                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowel++;
                }else{
                    conso++;
                }
            }
            System.out.println(vowel +" " +conso);
        }
    }
