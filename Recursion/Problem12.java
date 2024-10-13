package Recursion;

import Strings.StrBuilder;

//Remove Duplicates in a string "aaabhinavSiingh" the letters are from a to z
public class Problem12 {
    public static void removeDup(String str, int idx, StringBuilder newStr , boolean map[]){
        if (idx==str.length()) {
            System.out.println(newStr);
            return;
        }
            char currchar=str.charAt(idx);
            if (map[currchar-'a']==true) {
                removeDup(str, idx+1, newStr, map);
            }else{
                map[currchar-'a']=true;
                removeDup(str, idx+1, newStr.append(currchar), map);
            }
    }
    public static void main(String[] args) {
        String str = "aaabhinavsiingh";
        removeDup(str, 0, new StringBuilder(),new boolean[26]);
    }
}
