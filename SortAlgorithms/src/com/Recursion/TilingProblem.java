package com.Recursion;

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tiling(3));
    }
    public static int tiling(int n ){//2xn floor size
        if(n==0 || n==1) return 1;
        //vertical choice:
//        int vt  = tiling(n-1);
//        //horizontal choice:
//        int ht  = tiling(n-2);
//        int totalWays = vt+ht;
        return tiling(n-1) + tiling(n-2);
    }
}
