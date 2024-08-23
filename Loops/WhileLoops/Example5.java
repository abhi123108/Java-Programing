package Loops.WhileLoops;

public class Example5 {
    public static void main(String[] args) {
        int n=346886;
        while (n>0) {
            int lastDidit=n%10;
            System.out.println(lastDidit + " ");
            n=n/10;
        }
    }
}
