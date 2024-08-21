package ConditionalStatement.IfElse;
import java.util.*;
public class IfElseStatement {
    public static void main(String[] args) {
        int age=22;
        if (age>=18) {
            System.out.println("adult : Drive , Vote");
        }
        if (age>13 && age<18) {
            System.out.println("teenage");
        }
        else{
            System.out.println("not adult");
        }
    }
}
