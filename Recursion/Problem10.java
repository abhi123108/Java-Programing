package Recursion;
//Print X^n in O(logn)
public class Problem10 {
    public static int pow(int x , int n){
        if (n==0) {
            return 1;
        }
        int halfpow=pow(x , n/2);
        int halfpowSq=halfpow*halfpow;

        //n is odd
        if (n%2!=0) {
            halfpowSq=x*halfpowSq;
        }
        return halfpowSq;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 03));
    }
}
//Time Complexity= O(logn)