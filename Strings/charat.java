package Strings;

public class charat {
    public static void printletters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName="Abhinav";
        String lastName = "Singh";
        String fullName=firstName + " " + lastName;


        printletters(fullName);
    }
}
