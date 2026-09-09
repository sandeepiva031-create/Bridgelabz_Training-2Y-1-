package Arrays.Logical_Building;

import java.util.Scanner;

public class ThreeDistinctChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Char Value :- ");
        String s =sc.nextLine();

        int size=3;
        int count=0;

        for(int i=0 ; i<s.length()-size ; i++){
            String k=s.substring(i,i+size);

            if(k.charAt(0)!=k.charAt(1)
            && k.charAt(1)!=k.charAt(2)
            && k.charAt(0)!=k.charAt(2)){
                count++;
            }
        }
        System.out.println(count);
    }
}
