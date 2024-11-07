package ArrList;
import java.util.ArrayList;
//two pointer approach

public class Problem8 {
    public static int storeWater(ArrayList<Integer> hieght){
        int maxWater=0;
        int lp=0;
        int rp= hieght.size()-1;
    
        //calculate water area
        while(lp<rp){
            int ht=Math.min(hieght.get(lp), hieght.get(rp));
            int width=rp-lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
    
            // update ptr
            if(hieght.get(lp)<hieght.get(rp)){
                lp++;
            }else{
                rp--;
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


//TimeComplexityO(n)