package Recursion;
//Write a function to find the first occurance of an elememt in an array
public class Problem7 {
    public static int firstOcc(int arr[], int key, int i){
        if (i==arr.length) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return firstOcc(arr,key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,3,5,9,7,4};
        System.out.println(firstOcc(arr, 5,0 ));
    }
}
