package Recursion;
//Check if given array is sorted or not
public class Problem6 {
    public static boolean CheckSort(int arr[],int i){
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }

        return CheckSort(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        System.out.println(CheckSort(arr, 0));
    }
}
//Yime Comlexity = O(n)