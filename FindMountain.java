package Questions;

public class FindMountain {
    public static void main(String[] args) {
    }
    public static int search(int[] arr,int target){
        int peak = findPeakElement(arr);
        int firstHalf = orderAgno(arr,target,0,peak);
        if (firstHalf != -1){
            return firstHalf;
        }
        return orderAgno(arr,target,peak+1,arr.length-1);

    }
    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //Find the middle value
            int mid = start + (end - start) / 2; //5 s+e/2
            if (arr[mid] > arr[mid + 1]) {
                //We are looking at dec'ing part of array we have to look at left also.
                end = mid;
            } else {
                //you are in asc'ing part of array
                start = mid + 1;
            }
        }
        return start;
    }
    public static int orderAgno(int[] arr,int target,int start,int end){
        //finding sorted or not in asc/desc
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            //Find the middle value
            int mid = start + (end - start) / 2;//5 s+e/2
            if (arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
