package Arrays.Sliding_Window_Tech;

import java.sql.SQLOutput;
import java.util.Scanner;

public class subArraySum {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size :- ");
        int size=sc.nextInt();
        int nums[]=new int[size];
        System.out.print("Enter Element of Array :- ");
        for(int i=0 ;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter Size of Window :- ");
        int window=sc.nextInt();
        int sum=0;
        for(int i=0;i<window;i++){
            sum+=nums[i];
        }
        int max=sum;
        for(int i=1;i<=size-window;i++){
            sum=sum-nums[i-1]+nums[i+window-1];
            max=Math.max(sum,max);
        }
        System.out.println(max);
    }
}
