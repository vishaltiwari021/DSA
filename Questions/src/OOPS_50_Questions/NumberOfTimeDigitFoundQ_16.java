package OOPS_50_Questions;

import java.util.Scanner;

public class NumberOfTimeDigitFoundQ_16 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        long N  = sc.nextLong();//input number
        int digit = sc.nextInt();//digit which is to be repeated itself
        int count  = countDigit(N,digit);
        System.out.println(count);
    }
    public static int countDigit(long num,int digit){
        int count  = 0 ;
        if(num == 0 && digit ==0) return 1;
        while(num>0){
            long lastdigit  = num % 10;
            if(lastdigit == digit){
                count++;
            }
            num/=10;
        }
        return  count;
    }
}
