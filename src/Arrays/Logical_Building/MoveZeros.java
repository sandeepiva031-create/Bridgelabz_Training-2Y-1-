package Arrays.Logical_Building;

import java.util.Scanner;

public class MoveZeros {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[]=new int[size];

        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }

        int start=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums [i];
                nums[i]=nums[start];
                nums[start]=temp;
                start++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
