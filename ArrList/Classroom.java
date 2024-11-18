package ArrList;
import java.util.ArrayList;
public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
    ArrayList<String> list1= new ArrayList<>();

    list.add(1);  //O(1)
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    

    //list.add(1,5);  //O(n)
    // getElement   O(1)
    int element=list.get(1);
    System.out.println(element);

    //Remove element  O(n)
    list.remove(2);
    System.out.println(list);

    //Set element at index   O(n)
    list.set(2 ,10);
    System.out.println(list);

    //contain   TC- O(n)
    System.out.println(list.contains(1));
    System.out.println(list.contains(11));
    }
}
