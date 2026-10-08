package Arrays.Logical_Building;

import java.util.Scanner;

public class AvgElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[]=new int[size];

        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        double avg=(double)sum/size;

        System.out.printf("%.5f",avg);
    }
}
