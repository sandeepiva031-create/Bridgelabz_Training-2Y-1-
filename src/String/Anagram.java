package String;

public class Anagram {
    static void main(String[] args) {
        String s1= "listen";
        String s2="sileng";

        int freq[]=new int[225];

        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        boolean anagram=true;

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                anagram=false;
                break;
            }
        }
        if(anagram){
            System.out.println("Anagram");
        }else{
            System.out.println("not a  Anagram");
        }

    }
}
