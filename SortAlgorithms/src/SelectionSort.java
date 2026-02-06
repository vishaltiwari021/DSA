import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
    int [] arr = {4,1,2,5};
        for (int i = 0; i < arr.length; i++) {
            //find the max element:
            int last  = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }
        System.out.println(Arrays.toString(arr));

    }
    static int getMaxIndex(int[]arr,int start,int end){
        int max  = start;
        for (int i = start; i<=end ; i++) {
            if(arr[max]<arr[i]){
                max = 1;
            }
        }
        return max;
    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
