package Array;
//find the largest number in given array[1,2,6,3,5]
public class LargestNumber {
    public static int GetLargest(int number[]){
        int largest=Integer.MIN_VALUE; //-infinity
    for(int i=0; i<number.length; i++){
        if (largest<number[i]) {
            largest=number[i];
    }
            
        }
        return  largest ;
    }
    public static void main(String[] args) {
        int numbers[]={3,1,2,5,8,6};
        System.out.println("largest number is :"+GetLargest(numbers));
    }

}
