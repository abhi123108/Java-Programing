package BackTracking;
//Grid Ways- Find the nuber of ways to reach from (0,0) to (N-1,M-1) in a NxM Grid. Allow moves -RIght or down
public class Problem7 {
    public static int gridways(int i , int j,int n , int m){
        if (i==n-1 && j==m-1) {    //condition for last cell
            return 1;
        }else if (i==n || j==n) {   //boundary cross condition
            return 0;
        }
        int w1=gridways(i+1, j, n, m);
        int w2=gridways(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3 , m=3;
        System.out.println(gridways(0, 0, n, m));
    }
}
