package ArrList;

import java.util.ArrayList;
//2 pointer approach
public class Problem10 {
    public static boolean pairSum(ArrayList<Integer>list, int target){
        int lp=0;
        int rp=list.size()-1;

        while(lp !=rp){
            //case 1 
            if (list.get(lp)+list.get(rp)==target) {
                return true;
            }

            //case2
            if (list.get(lp)+list.get(rp)<target) {
                lp++;
            }else{
                //case3
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        int target=3;
        System.out.println(pairSum(list, target));
    }
}
