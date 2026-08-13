package Random_Practice;

public class PrimeNumber_func {
    public static void isPrimeNumber(int n){
        boolean isPrime= true;
    for(int i=2;i*i<n;i++){
        if(n%i == 0){
            isPrime = false;
        }
    }
    if(isPrime)  System.out.println(true);
    else System.out.println(false);
}
public static void main(String[] args) {
    isPrimeNumber(13);
}
}
