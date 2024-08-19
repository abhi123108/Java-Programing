import java.util.*;
public class TypePromotion {
    public static void main(String[] args) {
        char a='a';
        char b='b';                        
        System.out.println((int)(b));          //(EXAMPLE 1)
        System.out.println(b-a);//TYPE PROMOTION ONLY TAKES PLACE WITH THE EXPRESSION
        System.out.println((int)(a));

        //THIS ANSWER DOES NOT MAKE ANY SENSE
        short s=5;
        byte v=24;
        char c='c';                         //(EXAMPLE 2)
        byte bt=(byte) (s+v+c);
        System.out.println(bt);


        int x=5;
        float y=12.4f;
        long z=24;                           //(EXAMPLE 3)
        double d= 30;
        double ans=x+y+z+d;
        System.out.println(ans);
    }
    
} 