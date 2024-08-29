package Functions;

public class CallByValue {
    public static void Swap(int a , int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a ="+a);
        System.out.println("b =" + b);
    }    public static void main(String[] args) {
        Swap(4, 05);
    }
}
