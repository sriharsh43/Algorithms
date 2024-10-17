package Questions;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {0,2,1,0};
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            //Find the middle value
            int mid = start + (end - start) / 2; // s+e/2
            if (nums[mid] > nums[mid + 1]) {
                //We are looking at dec'ing part of array we have to look at left also.
                end = mid;
            } else {
                //you are in asc'ing part of array
                start = mid + 1;
            }
        }
        return start;
    }
}
