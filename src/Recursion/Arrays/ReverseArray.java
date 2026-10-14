package Recursion.Arrays;

public class ReverseArray {

    public static void print(int arr[],int index){
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        print(arr,index+1);
    }

    static void rev(int arr[] , int index) {
        if(index== arr.length){
            return;
        }

        rev(arr, index+1);
        System.out.print(arr[index]+" ");
    }

    static void main(String[] args) {
        int arr[] = {1 , 4, 2 , 45 ,35 ,37};
        print(arr,0);

        System.out.println();

        rev(arr,0);

    }
}
