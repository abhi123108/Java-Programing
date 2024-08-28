package Functions;
//check the number is prime or not
public class NumberIsPrimeorNot {
    //only for n>=2
    //public static boolean isPrime(int n){
        //corner cases
        //2
        //if(n==2){
       // return true;
        //}
        //boolean isPrime=true;
        //for(int i=2; i<=n-1; i++){
            //if (n%i==0) {
                //return false;
            //}
        //} 
        
        //return true;
    //}
public static boolean isPrime(int n){
    if (n==2) {
        return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
        if (n%i==0) {
            return false;
        }
    }
    return true;
}

    //print all prime number in range 
    public static void PrimeInRange(int n){
        for (int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PrimeInRange(100);
    }
}
