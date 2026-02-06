public class LargestNumber {
    public static int maxNumber(int[] arr){
        int max = Integer.MIN_VALUE ;//-infinity
        int min = Integer.MAX_VALUE;//+infinity
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if(min>arr[i]){
                min =arr[i];
            }
        }
        System.out.println("min value :: " + min);
        return max;
    }
    public static void main(String[] args) {
        int [] arr  = {1,2,4,6,8,9,11};
        int value  = maxNumber(arr);
        System.out.println(value);
    }
}
