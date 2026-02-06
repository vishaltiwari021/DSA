package com.Recursion;
//Print the power of any number of N: TC O(n)
public class PowerOfN {
    public static void main(String[] args) {
        System.out.println(optimized(2,5));
    }
    public static int power(int x ,int n){
        if(n==0) return 1;
        return x * power(x,n-1);
    }
    //optimization of same problem
    public static int optimized(int a, int b){
        if (b==0) return 1;
        int halfPower = optimized(a,b/2) ;
        int halfPowerSq = halfPower * halfPower;

        if( b % 2 != 0){
            halfPowerSq =  a* halfPowerSq;
        }
        return halfPowerSq;
    }

}
