package Recursion;

public class Example2 {
    public static void printIn(int n){
        if (n==1) {
            System.out.print(n +" ");
            return;
        }
        printIn(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        printIn(n);
    }
}
