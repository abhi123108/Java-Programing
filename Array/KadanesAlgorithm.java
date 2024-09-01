package Array;

public class KadanesAlgorithm {
    public static void kadanes(int numbers[]){
        int Maxsum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0; i<numbers.length; i++){
            currSum=currSum+numbers[i];
            if (currSum<0) {
                currSum=0;
            }
            Maxsum=Math.max(currSum,Maxsum);
        }
        System.out.println("Maximum Subarray Sum is : "+ Maxsum);
    }
    public static void main(String arg[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}


//Time Complexity= O(n)