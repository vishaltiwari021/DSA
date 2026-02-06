public class Main {
    public static void main(String[] args) {
        // Binary Search: used for sorted arrays.
    int [] arr = {2,4,6,8,12,14,16,18,20};
    int target =  14;
        System.out.println(binarySearch(arr,target));

    }
    static  int binarySearch(int[] arr ,int target) {
        int st  = 0;
        int ed = arr.length-1;
        while(st<=ed){
            int mid  = st+(ed-st)/2;
            if(target >arr[mid]){
                st  = mid +1 ;
            }
            else if(target<arr[mid]){
                ed  = mid -1;
            }
            else{
                return  mid;
            }
        }
        return -1;
    }

}