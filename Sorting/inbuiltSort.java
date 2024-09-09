package Sorting;
import java.util.Arrays;
import java.util.Collection;
public class inbuiltSort {
    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[]={5,3,1,4,2};
        Arrays.sort(arr);
        //Arrays.sort(arr , Collection.reverseOrder());
        //Arrays.sort(arr , 0 ,3);
        printArr(arr);
    }
}
