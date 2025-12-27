package com.Arrays;

import java.util.Arrays;

public class MoveNegativeNumber {
    public static void main(String[] args) {
        //Move all negative numbers to beginning and positive to end with constant extra space
        int [] arr  = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int [] ans  = moves(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int [] moves(int []arr){
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
