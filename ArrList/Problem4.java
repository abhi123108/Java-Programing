package ArrList;
import java.util.ArrayList;
import java.util.Collections;
 //Sorting
public class Problem4 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(3);  //O(1)
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(5);
        
        System.out.println(list);
        Collections.sort(list);  //ascending
        System.out.println(list);

        Collections.sort(list ,Collections.reverseOrder());
        System.out.println(list
        );
    }
}
