package Arrays.Sliding_Window_Tech;

import java.util.Scanner;

public class subArraySum {
    static void main() {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Size of Array :- ");
        int n=sc.nextInt();


        int nums[]=new int[n];
        System.out.println("Enter Element of Array :- ");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter Size of Sub Array :- ");
        int size=sc.nextInt();

        int sum=0;

        for(int i=0;i<size;i++){
            sum+=nums[i];
        }
        System.out.println(sum);
        for(int i=1;i<=nums.length-size;i++){
            sum=sum-nums[i-1]+nums[i+size-1];
            System.out.println(sum);
        }

    }
}
