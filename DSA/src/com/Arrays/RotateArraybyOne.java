package com.Arrays;

import java.util.Arrays;

public class RotateArraybyOne {
    public static void main(String[] args) {
        //If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
        int [] arr = {9, 8, 7, 6, 4, 2, 1, 3};
        int n  = arr.length;
        int last = arr[n-1];
        for (int i = n-1; i >0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));
    }
}
