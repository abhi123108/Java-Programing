package Recursion;
//Print all binary string of size N without consecutive ones.
public class Problem14 {
    public static void binaryStrProblem(int n,int lastplace,String str  ){
        if (n==0) {
            System.out.println(str);
            return;
        }
        binaryStrProblem(n-1, 0, str+"0");
        if (lastplace==0) {
            binaryStrProblem(n-1, 1, str+"1");
        }
    
    }
    public static void main(String[] args) {
        binaryStrProblem(3, 0, "");
    }
}
