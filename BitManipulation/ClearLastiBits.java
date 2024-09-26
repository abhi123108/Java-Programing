package BitManipulation;

public class ClearLastiBits {
    public static int clearLastiThBit(int n , int i){
        int bitMask= ~(0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastiThBit(15,2));
    }
}
