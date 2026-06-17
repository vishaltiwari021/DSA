public class SumEqToTrg {
    public static boolean sumEqTarget(int [] num, int k){
        int st =0 ;
        int ed = num.length-1;
        while (st<=ed){
            int sum = num[st]+num[ed];
            System.out.println(sum);
            if(sum == k){
                return true;
            } else if (sum<k) {
                st++;
            }else{
                ed--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};
        int k = 10;
        System.out.println(sumEqTarget(arr,k));
    }
}
