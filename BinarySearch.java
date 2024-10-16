public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,5,7,11,16,19,29};
//    int[] arr= {-3,-5,-19,-20,2,5,9,12,16,18,20}; //sorted array
    int target = 16;
    int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){   
            // find the middle element
            //int mid = (start + end) / 2 but it is not possible for larger integer values
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
/*Order Agnostic Binary Search is the elements are sorted in descending order {90,75,18,12,6,4,3,1}
target > mid element = left (end = mid -1 )
target < mid element = right (start = mid + 1)
 */