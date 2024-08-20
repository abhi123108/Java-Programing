package OPERATORS;

public class LogicalOperators {
    public static void main(String[] args) {
        //LOGICAL AND
        System.out.println((2>1)&&(9>3));
        System.out.println((2>5)&&(9>3));
        System.out.println((1>17)&&(9>65));
        System.out.println((2<1)&&(6>3));


        //LOGICAL OR
        System.out.println((3<2)||(4<5));
        System.out.println((3<5)||(5<3));
        System.out.println((2>1)||(3>1));
        System.out.println((3<2)||(11<10));


        //LOGICAL NOT
        System.out.println(!(3<2));
        System.out.println(!(3>2));
        
    }  
}
