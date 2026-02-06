package Loops;

public class CountOfNumber {
    public static void main(String[] args) {
        int n =24568;
        int count =0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
