package Questions;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(Search(arr, target));
        //System.out.println(FindPivot(arr));
    }

    static int Search(int[] nums, int target) {
        int pivot = FindPivot(nums);
        //If pivot nof found then it is not rotated
        if (pivot == -1) {
            return binSearch(nums, target, 0, nums.length - 1);
        }
        //If pivot is found you have 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binSearch(nums, target, 0, pivot - 1);
        }
        return binSearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binSearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            //Find the middle value
            int mid = start + (end - start) / 2; //5 s+e/2
            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;

            }
        }
        return -1;
    }

    static int FindPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //Find the middle value
            int mid = start + (end - start) / 2;
            // We have 4 possible cases :
            if ((mid < end) && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int removeDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                // check whether end is pivot
                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

