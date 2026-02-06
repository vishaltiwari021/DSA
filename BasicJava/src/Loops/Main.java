package Loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("enter the Number::");
        Scanner sc  = new Scanner(System.in);
        int number  = sc.nextInt();
        //***********increment of number*********
        for (int i=0;i<number;i++){
            System.out.println(i);
        }
        //**********************decrement of number*****************
        for(int c =10;c>=1;c--){
            System.out.println(c);
        }
    }
}
