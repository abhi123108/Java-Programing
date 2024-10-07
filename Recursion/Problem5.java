package Recursion;
//print Nth Fibonacci Number
public class Problem5 {
    public static int Fibb(int n){
        if (n==0||n==1) {
            return n;
        }
        int fibNm1=Fibb(n-1);
        int fibNm2=Fibb(n-2);
        int fibn=Fibb(n-1)+Fibb(n-2);
        return fibn;
    }
    public static void main(String[] args) {
        int n= 9;
        System.out.println(Fibb(n));
    }
}
//Time Complexity=O(2^n)