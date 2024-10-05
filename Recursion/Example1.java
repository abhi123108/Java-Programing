package Recursion;
//Print number from n to 1
public class Example1 {
    public static void printDec(int n){
        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.println(n +" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printDec(n);
    }
}
