package com.Arrays;

import java.util.Arrays;

public class kthsmallest {
    public static void main(String[] args) {
        int [] arr ={10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        int k = 4;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
            if(i==k-1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
