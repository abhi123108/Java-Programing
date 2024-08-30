package Array;

public class SubArrays {  //a continuous part of array
    public static void Subarray(int numbers[]){
        int Tp=0;
        for (int i=0; i<numbers.length; i++){
            int start=i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k] +" ");
                }
                Tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total Sybarrays ="+ Tp);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        Subarray(numbers);
    }
}
