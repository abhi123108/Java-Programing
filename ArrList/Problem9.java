package ArrList;
import java.util.*;;
public class Problem9 {
    public static boolean pairsum(ArrayList<Integer> list, int target){

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if (list.get(i)+list.get(j)==target) {
                    return true;
                }
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

        int target=8;
        System.out.println(pairsum(list, target));
    }
}
