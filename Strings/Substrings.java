package Strings;

public class Substrings {
    public static String Subtring(String str , int si , int ei){
        String substr ="";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(Subtring(str, 0, 5));
    }
}
