package Questions;

public class TrappingRainwater {
    public static int trappedrainwater(int Height[]){
        int n=Height.length;
        //calculate left max boundary - array
        int leftmax[]=new int[n];
        leftmax[0]=Height[0];
        for(int i=1; i<n; i++){
            leftmax[i]= Math.max(Height[i], leftmax[i-1]);
        }
        //calculate =right max boundary - array
        int rightmax[]=new int[n];
        rightmax[n-1]=Height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i]=Math.max(Height[i], rightmax[i+1]);
        }
        //loop
        int trappedwater=0;
        for(int i=0; i<n; i++){
            //waterlevel=min(leftmax boundary , rightmax boundary)
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
             //trapped water=waterlevel - hight[i]
            trappedwater+=waterlevel-Height[i];
        }
        return trappedwater;
        
        

    }
    public static void main(String[] args) {
        int Height[]={4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(Height));
    }
}
//time complexity=O(n)