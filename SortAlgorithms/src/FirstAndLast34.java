public class FirstAndLast34 {
    public static void main(String[] args) {
        int [] nums  = {5,7,7,7,7,8,8,10};
        int target = 7;


    }
    public int search (int [] nums , int target, boolean findstartindex){
        int ans  = -1;
        int st  =0 ;
        int ed  = nums.length-1;
        while(st<=ed){
            int mid  = st + (ed - st)/2;
            //
            if(target < nums[mid] ){
                ed =mid-1;
            }
            else if (target>nums[mid]){
                st  = mid+1;
            }
            else{
                ans = mid;
                if(findstartindex){
                    ed  = mid-1;
                }
                else{
                    st = mid+1;
                }

            }
        }
        return ans;
    }
}
