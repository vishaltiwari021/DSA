public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 10, 14, 16, 18};
        int target = 10;
        System.out.println(FloorOfnumber(arr, target));
    }
    static int FloorOfnumber(int []arr , int target){
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
        return ed;
    }
}

