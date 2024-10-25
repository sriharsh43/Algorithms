package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int[] arr = {3,1,4,5,2};
    Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //Find the max item using findMax in the array and swap with swap function to correct index
            int last = arr.length-i-1; //last is the lastIndex in the array
            int maxIndex = findMax(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end ; i++) {
            if (arr[max] < arr[i]){
             max = i;
            }
            
        }
        return max;
    }

}
