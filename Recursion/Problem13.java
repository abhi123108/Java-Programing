package Recursion;
//Given n friends , each one can remain single or can be paired up with some other friend.
//Each friend can be paired only only once . Find out the total no of ways in which friend can remain single or can be paired up.
public class Problem13 {
    public static int pairProblem(int n){
        if (n==1||n==2) {
            return n;
        }
        int fnm1=pairProblem(n-1);
        int fnm2=pairProblem(n-2);
        int pairWays=fnm1*fnm1;
        int Totalways=fnm1+(fnm1*fnm2);
        return Totalways;

        //compact
        //return pairProblem(n-1)+(n-1)*pairProblem(n-2);
        
    }
    public static void main(String[] args) {
        System.out.println(pairProblem(3));
    }
}
