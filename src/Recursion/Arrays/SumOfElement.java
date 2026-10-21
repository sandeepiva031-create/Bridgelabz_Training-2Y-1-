package Recursion.Arrays;

public class SumOfElement {

    public static int sum(int arr[],int index){

        if(index==arr.length){
            return 0;
        }

        int add = sum(arr,index+1);

        return add+arr[index];
    }

    static void main() {
        int arr[]={1,2,3,4,5};
        System.out.println(sum(arr,0));
    }
}
