package Questions;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //Order Agnostic BS is an algo where we don't know the array is in ascending order or descending order
        int[] arr = {2,15,18,34,10,13,88,104,67,54};
        int target = 10;
        int ans = orderAgno(arr,target);
        System.out.println(ans);
    }
    public static int orderAgno(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
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
