package com.Recursion;

public class FriendsPairing {
    public static void main(String[] args) {
        System.out.println(friendsPair(3));
    }
    public static  int friendsPair(int n){
        if(n==1 || n==2) return n;
        //single:
//        int fn1 = friendsPair(n-1);
//        //pai:
//        int fn2 = friendsPair(n-2);
//        int pairWays = (n-1) * fn2;
//        int totalWays = fn1 + pairWays;
        return friendsPair(n-1) + (n-1) *  friendsPair(n-2);
    }
}
