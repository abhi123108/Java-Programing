package Sorting;

public class SelectionSort {
    public static void Selection(int arr[]){
    for(int i=0; i<arr.length-1; i++){
        int minPos=i;
        for(int j=i+1; j<arr.length; j++){
            if (arr[minPos]>arr[j]) {
                minPos=j;
                }
            }
            int temp= arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
        int arr[]={ 1 ,4,4,3,7,8,9,6,5,2,1,1,9,7};
        Selection(arr);
        printArr(arr);
    }
}
