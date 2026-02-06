package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        // What is the composite number?
        //ans: a number which is not prime/ whose factors are lie between 2 to n-1.
        System.out.println("Enter the Number ::");
        Scanner sc =new Scanner(System.in);
        int number  = sc.nextInt();
        if(number==1){
            System.out.println("Neither prime and Nor composite");
        }
        for(int i =2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                System.out.println("Composite Number");
                    break;
            }else{
                System.out.println("Prime Number");
            }   break;
        }
    }
}
