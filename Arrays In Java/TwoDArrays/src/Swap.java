import java.util.Arrays;

public class Swap {
    public  static  void swap(int [] num ,int index1 ,int index2){
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp ;
    }
    static  void reverse(int []num){
        int start = 0 ;
        int end  = num.length-1;
        while(start<end){
            //swap
            swap(num, start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] num = {1,2,4,6,8,9,0};
//        swap(num ,2,5);
        reverse(num);
        System.out.println(Arrays.toString(num));

    }
}
