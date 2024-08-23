package Loops.WhileLoops;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        //sum of first n natural number
            Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while (i<=5) {
            sum=sum+i;
            i++;
            System.out.println(sum);
            
        }
    }
}
