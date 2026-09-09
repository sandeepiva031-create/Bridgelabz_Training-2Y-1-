package Arrays.Sliding_Window_Tech;

import java.util.Scanner;

public class SubArraySumEqK {

    static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Enter size of array :- ");
        int size=sc.nextInt();
        int window=sc.nextInt();

        int nums[]=new int[size];
        System.out.println("Enter element of Array:- ");

        for(int i=0;i<size;i++) {
            nums[i] = sc.nextInt();
        }
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
