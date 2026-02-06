package com.Arrays;
import java.util.*;
public class FindMaxMin {
    //find the amx and min element from the array...
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int max  = arr[arr.length-1];
//        int min  = arr[0];
//        System.out.println("max: "+max + " ,"+"min :"+ min);
        int mini = arr[0];
        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < mini)mini = arr[i];
            if(arr[i] > maxi)maxi = arr[i];
        }
        System.out.println("max: "+maxi + " ,"+"min :"+ mini);
    }
}
