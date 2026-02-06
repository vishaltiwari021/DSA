import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int [][] num  = { {1,2,3,4},{0,6,8},{66,88,3,5,9}};
        int target  =  0 ;
        int [] ans  = matrix(num,target);
//        System.out.println(Arrays.toString(ans));
        System.out.println(max(num));
        
    }
    static  int[] matrix(int[][] arr ,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(target == arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //----------------------------------------------------------
    //find the maximun:
    static  int max(int[][] arr){
        int max  = Integer.MIN_VALUE;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(arr[row][col]>max){
//                    max  = arr[row][col];
//                }
//            }
//        }
//        return max;

        for (int [] row :arr) {
            for (int element : row) {
             if(max < element){
                 max = element;
             }
            }
        }
        return max;
    }
    
}
