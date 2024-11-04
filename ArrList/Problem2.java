package ArrList;
import java.util.ArrayList;

//find Maximum in an Arraylist
public class Problem2 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(3);  //O(1)
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(5);

        int max=Integer.MIN_VALUE; 
        
        
        for(int i=0; i<list.size(); i++){
            if (max <list.get(i)) {
                max=list.get(i);
            }
            //or
            //max=Math.max(max , list.get(max));
        }
        System.out.println("max element = "+ max);
    }
}
