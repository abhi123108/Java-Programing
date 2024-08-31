package Array;

public class pairs {                   //Formula of total pairs= n(n-1)/2

    public static void PrintPairs(int numbers[]){
        int Tp=0;
        for( int i=0; i<numbers.length; i++){
            int curr=numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+curr +"," +numbers[j]+")");
                Tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs ="+ Tp);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        PrintPairs(numbers);
    }
}
 //Time Complexity of this code is O(n square)
    //n+(n-1)+(n-2)+(n-3)....1 is diectly proportional to O(n square)