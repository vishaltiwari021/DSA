package com.Recursion;

public class BinaryStrings {
    public static void main(String[] args) {
        printStrings(3,0,"");
    }
    public static void printStrings(int n, int lp, String str ){
        if(n==0) {
            System.out.println(str);
            return;
        }
//        if(lp == 0){
//            printStrings(n-1,0, str.append("0"));
//            printStrings(n-1,1, str.append("1"));
//        }
//        else{
//            printStrings(n-1,0, str.append("0"));
//        }
        printStrings(n-1,0, str+"0");
        if(lp == 0){
            printStrings(n-1,1, str+"1");
        }
    }
}
