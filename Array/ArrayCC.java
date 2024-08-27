package Array;

import java.util.Scanner;

public class ArrayCC {
    public static void main(String[] args) {
        int mark[]=new int[100];
        
        Scanner sc=new Scanner(System.in);
        mark[0]=sc.nextInt();//physics
        mark[1]=sc.nextInt();//maths
        mark[2]=sc.nextInt();//chem
        
        System.out.println("physics "+mark[0]);
        System.out.println("maths "+ mark[1]);
        System.out.println("chem "+mark[2]);

        mark[2]=mark[2]+3;             //updated value
        System.out.println("chem " +mark[2]);
        

        int percentage=(mark[0]+mark[1]+mark[2]/3);
        System.out.println("percentage ="+percentage +"%");
    }
}
