public class LinearSearch {
    public static void main(String[] args) {
        int [] arr  = {12,34 ,56,7,89,2,4,6,7,233,45,56,99};
        int target  = 12;
        int ans  = lineaSearch(arr,target);
        System.out.println("index of target element :" + ans);

    }
    //for index value
    static int lineaSearch(int [] arr ,int target){
        if(arr.length == 0 ){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element =  arr[i];
            if(element == target){
                return i ;
            }
        }
        return -1;
    }
}
