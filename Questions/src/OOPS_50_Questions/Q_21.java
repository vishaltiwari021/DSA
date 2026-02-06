package OOPS_50_Questions;

import java.util.Scanner;

public class Q_21 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N1  = sc.nextInt();//num of terms.
        int N2  = sc.nextInt();//not divisible by N2.
        int c  = 0 ;
        for (int i = 1; c<N1 ; i++) {
            int k = 3*i+2;//formula:3n+2.
            if(k%N2==0){
                continue;
            }
            else {
                System.out.println(k);
                c++;
            }
        }
    }
}
