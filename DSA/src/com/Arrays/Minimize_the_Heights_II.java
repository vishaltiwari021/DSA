package com.Arrays;

import java.util.Arrays;

public class Minimize_the_Heights_II {
    public static void main(String[] args) {
        int [] arr  = {1, 5, 8, 10};
        int k = 2;
        Arrays.sort(arr);
        int n = arr.length;
        int ans  = arr[n-1]-arr[0];
        int max = arr[n-1]-k;
        int min  = arr[0]+k;
        for (int i = 1; i < n; i++) {
            if(arr[i]-k<0) continue;;
           min =Math.min(min,arr[i]-k);
           max =Math.max(max,arr[i-1]+k);
           ans =Math.min(ans, max-min);
        }
        System.out.println(ans);
    }
}
