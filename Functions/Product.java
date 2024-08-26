package Functions;

public class Product {
    public static  int multiply(int a , int b){
        int Product=a*b;
        return Product;
    }
    public static void main(String[] args) {
        int a=4;
        int b = 3;
        int prod=multiply(a,b);
        System.out.println("a*b =" +prod );
        prod=multiply(10, 20);
        System.out.println("a*b =" +prod );
    }
}
