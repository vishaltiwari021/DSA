package com.Backtracking;

public class FindPermutations {
    public static void main(String[] args) {
        String  str = "abc";
        printPer(str,"");
    }
    public static  void printPer(String str , String ans){
        //base case
        if(str.length() ==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for (int i = 0; i < str.length(); i++) {
            char curr  = str.charAt(i);
            String newStr  = str.substring(0,i) + str.substring(i+1);
            printPer(newStr, ans+curr);
        }
    }
}
