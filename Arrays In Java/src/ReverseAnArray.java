import java.util.Arrays;

public class ReverseAnArray {
    public static void reverseAnArray(int[] number){
        int first = 0 ;
        int last  = number.length-1;
        while(first<last){
            int temp = number[last];
            number[last] =number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int[] number = {1,34,77,45};
        reverseAnArray(number);
        for (int i = 0; i < number.length; i++) {
//            System.out.println(number[i]+" ");
            System.out.println(Arrays.toString(number));
            break;
        }

    }
}
