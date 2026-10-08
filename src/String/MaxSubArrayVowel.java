package String;

public class MaxSubArrayVowel {

    public static boolean isVowel(char ch){
        return ch=='a' || ch == 'e' || ch == 'i' || ch=='o' || ch=='u';
    }
    static void main(String[] args) {


        String s = "abcioishd";

        int k=3;
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) {
                count++;
            }
        }
        max=count;

        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            max=Math.max(count, max);
        }
        System.out.println(max);
    }

}
