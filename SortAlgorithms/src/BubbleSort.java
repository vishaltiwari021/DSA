import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr  = {5,4,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr,j-1,j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
