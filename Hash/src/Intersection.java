import java.util.*;
public class Intersection {
    public static int intersection(int[] num1, int[] num2){
        HashSet<Integer> set =  new HashSet<>();
        int count = 0;
        for (int i = 0; i < num1.length; i++) {
            set.add(num1[i]);
        } for (int j = 0; j < num2.length; j++) {
            if(set.contains(num2[j])){
                count ++;
                set.remove(num2[j]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr1 = {7,3,9};
        int [] arr2 = {6,3,9,4,8,1};
        System.out.println(intersection(arr1,arr2));
    }
}
