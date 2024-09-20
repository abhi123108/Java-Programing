package Strings;
//Given a route containing 4 direction (E,W,N,S). 
//Find the shortest path to reach destination."WNEENESENNN"
public class ShortestPath {
    public static float Displacement(String path){
        int x=0 , y=0;
        for(int i =0; i<path.length(); i++){
            char dir =path.charAt(i);
            //South
            if (dir=='S') {
                y--;
            }
            //North
            else if (dir=='N') {
                y++;
            }
            //West
            else if (dir=='W') {
                x--;
            }
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String str ="WNEENESENNN";
        System.out.println(Displacement(str));
    }
}
