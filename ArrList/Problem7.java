package ArrList;
import java.util.*;

//container with Most water
//for given n lines on x-axis , use 2 lines to form a container such that it holds maximum water.
public class Problem7 {
    public static int storeWater(ArrayList<Integer>hieght){
        int maxWater=0;
        for(int i=0; i<hieght.size(); i++){
            for(int j=i+1; j<hieght.size(); j++){
                int ht=Math.min(hieght.get(i), hieght.get(j));
                int width=j-i;
                int currWater=ht*width;
                maxWater=Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> hieght= new ArrayList<>();
        hieght.add(1);
        hieght.add(8);
        hieght.add(6);
        hieght.add(2);
        hieght.add(5);
        hieght.add(4);
        hieght.add(8);
        hieght.add(3);
        hieght.add(7);

        System.out.println(storeWater(hieght));
    }
}
//Time Complexity=O(n^2)