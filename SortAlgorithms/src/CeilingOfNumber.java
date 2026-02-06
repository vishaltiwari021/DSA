public class CeilingOfNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,10,14,16,18};
        int target = 19;
        System.out.println(ceileOfnumber(arr,target));

    }
    static int ceileOfnumber(int []arr , int target){
        //but what if the target is greater than the greatest element in the array
        if(target > arr[arr.length-1]){
            return -1;
        }
        int st  = 0;
        int ed = arr.length-1;

        while(st<=ed){
            int mid  = st+(ed-st)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target<arr[mid]){
                ed  = mid -1;
            }
            else{
                st  = mid+1;
            }
        }
        return st;
    }
}
