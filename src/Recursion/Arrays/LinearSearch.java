package Recursion.Arrays;

public class LinearSearch {

    public static int search(int arr[],int index,int target){

        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }

        return search(arr,index+1,target);
    }

    static void main(String[] args) {
        int arr[]= {1,3,5,7,4,3,5,7,8,9,4,4,32,2,2};
        System.out.println(search(arr,0,3));
    }
}
