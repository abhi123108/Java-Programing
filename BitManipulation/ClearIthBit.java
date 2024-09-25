package BitManipulation;

public class ClearIthBit {
    public static int clearIthBit(int n , int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static int setIthbit(int n , int i){
        int bitMask= 1<<i;
        return n|bitMask;
    }
    public static int updatBit(int n , int i, int newBit){
        //if (newBit==0) {
        //    return clearIthBit(n, i);
        //}else{
        //    return setIthbit(n ,i);
        //}

        n=clearIthBit(n, i);
        int bitMask= newBit<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updatBit(10, 2,1 ));
    }
}
