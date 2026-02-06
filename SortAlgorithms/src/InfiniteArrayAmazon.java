public class InfiniteArrayAmazon {
    public static void main(String[] args) {
    int [] nums  = {3,5,7,9,10,90,100,130,140,170};
    int target = 10;
        System.out.println(ans(nums,target));
    }
    static  int ans (int [] nums,int target){
        //first we find the range
        //start with the box od size of 2
        int start  =0 ;
        int end  = 1;
        //condition for target to lie in the range
        while(target>nums[end]){
            int temp =end +1;//this is my new start
//          double the box value:
            end  =end  +(end-start+1)*2;
            start = temp;

        }
        return search(nums,target,start,end);
    }
    public  static int search(int [] nums ,int target,int start,int end){
        while(start<=end){
            int mid  = start+(end-start)/2;
            if(target >nums[mid]){
                start  = mid +1 ;
            }
            else if(target<nums[mid]){
                end  = mid -1;
            }
            else{
                return  mid;
            }
        }
        return -1;

    }
}
