package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_167 {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Size of Array :-");
        int size =sc.nextInt();
        int numbers[]=new int[size];
        int start=0;
        int end=size-1;
        System.out.println("Element of Array :-");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter Target :-");
        int target=sc.nextInt();
        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                System.out.print((start + 1) + "" + (end + 1));
                break;
            } else if (numbers[start] + numbers[end] > target) {
                end--;

            } else {
                start++;
            }
        }
    }
}





