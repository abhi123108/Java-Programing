package Recursion;
//print factorial of n
public class Problem3 {
    public static int fact(int n){
        if (n==0) {
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
}
//Time Complexity O(n)