package Functions;
import java.util.*;
public class Isprime {
    public  static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for (int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static void print(int n){
        Scanner sc  = new Scanner(System.in);
         n = sc.nextInt();
    }
    public static void main(String[] args) {
        int n = 0;
        print(n);
        System.out.println(isPrime(n));
    }
}
