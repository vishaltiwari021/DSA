package com.Recursion;

import java.sql.SQLOutput;

//fibonacci series: 1,1,2,3,5,8....
public class Fibonacci {
    public static void main(String[] args) {
    int n = 6;
        System.out.println(Series(n));
    }
    public static int Series(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        int m = Series(n-1);
        int g = Series(n-2);
        int sum  = m + g;
        return sum;
    }
}
