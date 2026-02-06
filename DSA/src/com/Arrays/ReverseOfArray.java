package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        System.out.println("Reverse Array:-");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int left  = 0 ;
        int right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.print(Arrays.toString(arr));


    }
}
