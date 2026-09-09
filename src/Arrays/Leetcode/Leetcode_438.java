package Arrays.Leetcode;

import java.util.*;

public class Leetcode_438 {

    static void main() {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string value :- ");
        String s=sc.nextLine();
        System.out.println("enter window :- ");
        String p=sc.nextLine();

        int len =s.length();
        int window = p.length();

        int sArr[]= new int[26];
        int pArr[]= new int[26];

        for(int i =0 ;i<window;i++){

            int si = s.charAt(i)-'a';
            int pi = p.charAt(i)-'a';

            sArr[i]++;
            pArr[i]++;
        }

        if(Arrays.equals(sArr,pArr)){
            list.add(0);
        }

        for(int i = 1 ; i <= len-window ; i++) {
            int pre = s.charAt(i - 1) - 'a';
            int next = s.charAt(i + window - 1) - 'a';

            sArr[pre]--;
            sArr[next]++;

            if (Arrays.equals(sArr, pArr)) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
