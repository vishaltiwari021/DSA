public class SearchInRange {
    public static void main(String[] args) {
        int [] arr  = {12,34 ,56,7,89,2,4,6,7,233,45,56,99};
        int target  = 12;
        int ans  = lineaSearch(arr,target,0,8);
        System.out.println(ans);
    }
    static int lineaSearch(int [] arr ,int target,int start, int end){
        if(arr.length == 0 ){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element =  arr[i];
            if(element == target){
                return i ;
            }
        }
        return -1;
    }
}
