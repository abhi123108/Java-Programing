package Functions;

import java.util.Scanner;

public class Example2 {
    public static void CalculateSum(int a , int b){ //parameters
        int sum=a+b;
        System.out.println("Sum is "+ sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        CalculateSum(a, b);  //arguments
    }
}
