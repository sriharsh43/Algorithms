package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
    int[] arr = {5,3,4,1,2};
    Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Insertion(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j] < arr[j-1]){
                    Swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }

    }
    public static void Swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
