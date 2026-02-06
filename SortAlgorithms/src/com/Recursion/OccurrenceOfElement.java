package com.Recursion;
//find the first occurrence of element in the array:
public class OccurrenceOfElement {
    public static void main(String[] args) {
    int [] arr ={1,2,3,4,5,6,7,5,8};
        System.out.println(lastOccurrence(arr,5,0));

    }
    public static int firstOccurrence(int []arr,int k,int i){
        if(i == arr.length) return -1;
        if(arr[i] == k) return i;
        return firstOccurrence(arr,k,i+1);

    }
    public static int lastOccurrence(int []arr,int k,int i){
        if(i == arr.length) return -1;
        int isFound  = lastOccurrence(arr,k,i+1);
        if(isFound == -1 && arr[i] == k){
            return i;
        }
        return isFound;

    }
}
