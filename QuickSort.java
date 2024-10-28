package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
       // Arrays.sort(arr);

    }
    static void quick(int[] arr, int low, int high){
        if (low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = (start+end) / 2;
        int pivot = arr[mid];
        while (start <= end){
            //If the array is already sorted then it will not swap
            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }
            if (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        //Now the pivot is the right position so sort the two halves
        quick(arr,end,low);
        quick(arr,start,high);

    }
}
