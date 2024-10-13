package Recursion;
//tillin problem
//Given a "2 x n"board and tiles of size "2 x1", 
//count the number of ways to tile the given board using the 2 X 1 tiles
//(A tile can either be placed horizontally or vertically)
public class Problem11 {
    public static int tiling(int n){
        if (n==0||n==1) {
            return 1;
        }
        //Vertical
        int fnm1= tiling(n-1);


        //horizontal

        int fnm2= tiling(n-2);

        int totalways= fnm1 + fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tiling(5));
    }
}
