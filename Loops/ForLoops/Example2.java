package Loops.ForLoops;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        //Display all numbers entered by the user except mutiple of 10
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("enter your number: ");
            int n=sc.nextInt();

            if (n%10==0) {
                continue;
            }
            System.out.println("Number was :" + n);
        } while (true);
    }
}
