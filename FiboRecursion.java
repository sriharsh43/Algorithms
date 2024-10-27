package RecursionConcept;

public class FiboRecursion {
    public static void main(String[] args) {
        int ans = fibo(6);
        System.out.println(ans);
        /*for (int i = 0; i < 11; i++) {
            System.out.println(FiboFormula(i));
        }*/
    }

    static int FiboFormula(int n){
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
    static int fibo(int n){
        //Base Condition
        if (n < 2){
            return n; // If my n is 0 or 1 it will be my base condition
        }
        return fibo(n-1) + fibo(n-2); //print the number RR

    }
}
