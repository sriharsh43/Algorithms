package MathsForDSA;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check Square root : ");
        int n = in.nextInt();
        int p = 3;//Upto 3 decimal places
        System.out.printf("%.3f",Sqrt(n,p)); //Prints upto 3 decimal places.
    }
    public static double Sqrt(int n , int p){
        int start = 0;
        int end = n;
        double root = 0.0;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid * mid == n){
                return mid;
            }
            if (mid * mid > n){
                end = mid - 1;
            }else{
                start = mid + 1;
                root = mid;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
    return root;
    }
}
