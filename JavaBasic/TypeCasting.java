import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float marks=99.99f;                  
        int marks2=(int)marks;             //(EXAMPLE 1)
        System.out.println(marks2);


        char ch='a';
        char ch2='b';
        int number=ch;                    //(EXAMPLE 2)
        int number2='b';
        System.out.println(number);
        System.out.println(number2);
    }
}
