package RecursionConcept;

public class BSInRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,66,78};
        int target =78;
        System.out.println(Search(arr,target,0,arr.length - 1));
    }
    static int Search(int[] arr,int target, int s , int e){
        if (s > e){
            return -1;
        }
        int m = s + e / 2;
        if (m == target){
            return m;
        }
        if (target < arr[m]){
        return Search(arr,target,s,m - 1);
        }
        return Search(arr,target,m + 1,e);
    }
}
