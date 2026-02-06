package com.Recursion;
//Call Stack is used internally in recursion:
public class First {
    public static void main(String[] args) {
        //print number in decreasing order:
        int n= 10;
        printInc(n);
    }
    public static  void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n +" ");
        printDec(n-1);
    }
    public static  void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n +" ");

    }
}
//what is Stack Overflow?

