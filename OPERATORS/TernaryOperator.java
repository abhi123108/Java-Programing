package OPERATORS;

public class TernaryOperator {
    public static void main(String[] args) {
        int number =4;
        //ternary operator
        String type=((number%2)==0)?"even" : "odd";
        System.out.println(type);

        //check if Student is pass or fail
        int marks=57;
        String reportcard=((marks>=33)? "pass" : "Fail");
        System.out.println(reportcard);
    }
}

