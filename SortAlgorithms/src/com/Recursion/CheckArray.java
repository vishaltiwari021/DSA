package com.Recursion;
//check array is sorted or not:
public class CheckArray {
    public static void main(String[] args) {
        int [] arr  ={1,2,3,9,5,6,7};
        System.out.println(isSorted(arr,0));
    }
    public static  boolean isSorted(int [] arr ,int i){
        if(i==arr.length-1) return true;
        if(arr[i]>arr[i+1]) return false;
        return isSorted(arr,i+1);
    }
}
