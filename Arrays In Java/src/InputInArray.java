
import java.util.*;

public class InputInArray {
    public static void main(String[] args) {
        //input using for loop
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //for-each loop:
//        for(int num :arr){//for every element in array, print the element
//            System.out.print(num+" ");//here num represent element in array
        }

    }
