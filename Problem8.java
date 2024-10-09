package Recursion;
//Write a function to find the first occurance of an elememt in an array
public class Problem8 {
    public static int lastOcc(int arr[], int key, int i){
        if (i==arr.length) {
            return -1;
        }
        int isFound=lastOcc(arr, key, i+1);
        if (isFound==-1 && arr[i]==key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={2,3,2,5,6,1,3,9,8};
        System.out.println(lastOcc(arr, 3, 0));
    }
}
