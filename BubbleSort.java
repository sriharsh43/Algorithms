package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //It will check with the adjacent element in the array
        int[] arr = {5,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr)); // prints in the string format
    }
    public static void bubble(int[] nums){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            //In each step the largest element will come at last
            for (int j = 1; j < nums.length - i; j++) {
                //Swap if the current item is smaller than previous one
                if (nums[j] < nums[j - 1]) {
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            //If you did'nt swap for a particular value of i then array is sorted no need to
            // check so stop the program.
            if (!swapped){
                break;
            }
        }
    }
}
