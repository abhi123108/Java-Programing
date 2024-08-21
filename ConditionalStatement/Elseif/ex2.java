package ConditionalStatement.Elseif;

public class ex2 {
    public static void main(String[] args) {
        //Print the largest of 3
        int a=1;
        int b=3;
        int c=6;
        if ((a>=b && a>=c)) {
            System.out.println("largest is a");
        }
        else if (b>=c) {
            System.out.println("largest is b");
        }
        else{
            System.out.println("largest is c");
        }
    }
}
