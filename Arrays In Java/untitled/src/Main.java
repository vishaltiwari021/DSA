public class Main {
    //TC:- O(n)
    public static boolean isPalindrome(int[] num){
        int l =0 ;
        int r = num.length-1;
        while(l<r){
            if(num[l]!=num[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        //TwoPointer
        //palindrome
        int [] arr  = {1,2,3,4,1};
        System.out.println(isPalindrome(arr));
    }
}