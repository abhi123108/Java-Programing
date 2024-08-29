package Array;

public class SmallestNumber {
    public static int GetSmallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<numbers.length;i++){
            if (smallest>numbers[i]) {
                smallest=numbers[i];
            }
        }return smallest;
    }
    public static void main(String[] args) {
        int numbers[]={1,3,2,8,5,4};
        System.out.println("smallest number is :"+ GetSmallest(numbers));
    }
}
