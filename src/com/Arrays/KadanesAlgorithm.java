package com.Arrays;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        //You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].
        int [] arr  ={2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));

    }
    static  int maxSubarraySum(int[] arr){
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i <arr.length; i++) {
            currentSum = Math.max(arr[i],currentSum +arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
