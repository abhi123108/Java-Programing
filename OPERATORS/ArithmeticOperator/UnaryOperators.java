package  OPERATORS.ArithmeticOperator; ;

public class UnaryOperators {
    public static void main(String[] args) {

        //UNARY OPERATOR
        int a=10;
        int b=++a;
        System.out.println(a);    //PRE INCREMENT
        System.out.println(b);
        

        int x=10;
        int y=x++;
        System.out.println(x);     //POST INCREMENT
        System.out.println(y);


        int u=12;
        int v=--u;
        System.out.println(u);       //PRE DECREMENT
        System.out.println(v);
        

        int i=10;
        int j=i--;
        System.out.println(i);       //POST DECREMENT
        System.out.println(j);
    }
}
