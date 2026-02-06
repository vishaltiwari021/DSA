public class BinarySearch {
    public static int binarySearch(int[]number,int key){
        int start = 0;
        int end = number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (number[mid] == key){
                return mid;
            }
            if(number[mid]< key){//right
                start = mid+1;
            }
            else{//left
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] number = {12,23,34,15,56,67,89};
        int key  = 15 ;
        int value = binarySearch(number,key);
        System.out.println("key is on index ::" + value);
    }
}
