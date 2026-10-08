package Arrays.Logical_Building;

import java.util.Scanner;

public class MostWaterContainer {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int left=0;
        int right=size-1;
        int maxwater=0;

        while(left<right){
            int wid= right-left;
            int len = Math.min(nums[left],nums[right]);

            int currwater= wid*len;

            maxwater= Math.max(currwater,maxwater);

            if(nums[left]<nums[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxwater);
    }
}
