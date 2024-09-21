package Strings;

public class StrCompression {
    public static String compress(String str){
        String newStr= "";
        for(int i=0; i<str.length(); i++){
            Integer count =1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if (count>1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static String CopmpressString(String str){
        StringBuilder sb= new StringBuilder("");
        
        int count = 1;
        for(int i=1; i<str.length(); i++ ){
                if (str.charAt(i)==str.charAt(i-1)) {
                    count++; //increament count if consucative are same
                }else{
                    sb.append(str.charAt(i-1)).append(count);
                    count =1; //reset the count for new character
                }
            }
            //Append the last character and its count
            sb.append(str.charAt(str.length()-1)).append(count);
            return sb.toString();
        }
    public static void main(String[] args) {
        String str= "aaabbbbcccccdde";
        System.out.println(CopmpressString(str));
    }
}
