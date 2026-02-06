public class LinearSearch {
    public static int linearSearch(int[] number ,int key){
        for (int i = 0; i < number.length; i++) {
            if(number[i] ==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] number = {1,23,34,56,787644,43,6,2,8,10};
        int key  =23;
       int index =  linearSearch(number,key);
       if(index == -1){
           System.out.println("key not found");
       }
       else{
           System.out.println("key is at index of  : " + index);
       }
    }
}
