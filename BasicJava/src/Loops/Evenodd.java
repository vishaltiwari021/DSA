package Loops;

import java.util.Scanner;
//This code is run for both even and odd number of ranges:
public class Evenodd {
    public static void main(String[] args) {
        //in this approach the loop is run 100 times BUT
//        for (int i = 1;i<=100;i++){
//                if(i%2!=0){
//                    System.out.println(i);
//                }
//        }
        // In this code the loop in run only 50 times
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int range  =sc.nextInt();
        for (int a =n;a<=range;a+=2){
            System.out.println(a);
        }
    }
}
