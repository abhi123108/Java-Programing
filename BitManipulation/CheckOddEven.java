package BitManipulation;

public class CheckOddEven {
    public static void OddOrEven(int n){
        int bitMask =1;
        if ((n & bitMask)==0) {
            //even
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        OddOrEven(5);
    }
}
