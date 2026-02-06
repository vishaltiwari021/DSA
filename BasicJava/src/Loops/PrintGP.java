package Loops;

import java.util.Scanner;

public class PrintGP {
    public static void main(String[] args) {
        //Series of GP => 1,2,4,8,16,....
        //formula of GP =>
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number  =  sc.nextInt();
        System.out.print("Enter the first term of GP:");
        int firstTerm =sc.nextInt();
        System.out.print("Enter the the Common Ratio of GP:");
        int commonRatio =sc.nextInt();
        for(int i =1;i<=number;i++){
            System.out.print(firstTerm+" ");
            firstTerm *= commonRatio;
        }

    }
}
