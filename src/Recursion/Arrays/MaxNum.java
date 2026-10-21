package Recursion.Arrays;

public class MaxNum {

    public static  int max(int arr[],int index,int max){

        if(index==arr.length){
            return max;
        }
        if(arr[index]>max){
            max=arr[index];
        }
        return max(arr,index+1 , max);
    }

    static void main(String[] args) {
        int arr[]={1,3,5,7,4,3,9};
        System.out.println(max(arr,0 , Integer.MIN_VALUE));
    }
}
