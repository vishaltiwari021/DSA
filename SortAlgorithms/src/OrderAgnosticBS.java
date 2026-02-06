public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,12,14,16,18,20};
        int target =  14;
        System.out.println(orderAgnosticBS(arr,target));

    }

    static int orderAgnosticBS(int[] arr, int target) {
        int st = 0;
        int ed = arr.length - 1;
        //find weather the arr is ascending or descending
        boolean isAse  = arr[st]<arr[ed];
        while (st <= ed) {
            int mid = st + (ed - st) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAse){//ascending:
                if (target > arr[mid]) {
                    st = mid + 1;
                } else{
                    ed = mid - 1;
                }
            }else {
                //descending:
                if (target < arr[mid]) {
                    st = mid + 1;
                } else{
                    ed = mid - 1;
                }
            }
        }
        return -1;
    }
}
