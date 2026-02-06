package com.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n =100;
        //System.out.println(printFac(n));
        System.out.println(sumOfNaturalNumber(n));
    }
    //recursive function for factorial:
    public static int printFac(int n){
        if(n==0){
            return 1;
        }
        int fnm = printFac((n-1));
        int fn  = n*fnm;
        return fn;
    }
    //recursive function for the sum of N natural numbers:
    public static int sumOfNaturalNumber(int n){
       if(n==1){
           return 1;
       }
       int m = sumOfNaturalNumber(n-1);
       int sum  = n+m;
       return sum;
    }


}
