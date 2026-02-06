public class SubArray {

    //what is sub array ? ans: a continuous part of an array...
    public static void printSubArray(int []arr){
        int totalSubarray = 0 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j<arr.length; j++){
                for (int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                totalSubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray : "+ totalSubarray);
    }

    public static void sumOfSubArray(int [] arr ) {
        int sum  = 0 ;
        int max_sum  = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j<arr.length; j++){
                sum = 0 ;
                for (int k = i; k<=j; k++) {
                    //subarray sum:
                   sum+= arr[k];
                }
                System.out.println(sum);
                if (max_sum < sum) {
                    max_sum = sum;
                }
            }
        }
        System.out.println("max sum of array: " + max_sum);
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
//        printSubArray(arr);
        sumOfSubArray(arr);

    }
}
