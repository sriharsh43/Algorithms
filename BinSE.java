public class BinSE {
    public static void main(String[] args) {
        int[] nums = {1,5,7,11,16,19,29};
        int target =7;
        int ans = binarySearch(nums,target,0,6);
        System.out.println(ans);
    }
    static int binarySearch(int[]arr,int target,int start,int end){
        int mid = start + (end - start) / 2;
        while(start <= end){
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;

    }
}
