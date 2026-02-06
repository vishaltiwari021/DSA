package OOPS_50_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfSpecialNumber {
    public static void main(String[] args) {
        // This is the code of array input by user:
        System.out.println("Enter the size of array you wants ::");
        Scanner sc  = new Scanner(System.in);
        int size  = sc.nextInt();
        int[]arr = new int [size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //-----------------------------------------------------------
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(size%arr[i]==0){
                sum = arr[i]*arr[i] + sum;
            }
        }
        System.out.println(sum);
    }
}
