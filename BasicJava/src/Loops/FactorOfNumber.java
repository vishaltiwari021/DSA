package Loops;
import java.util.*;
public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int n = sc.nextInt();//13
        int hf = 1;
        for(int i =1;i<n;i++){
            if(n%i==0){
                hf = i;
            }
        }
        System.out.println(hf);
    }
}
