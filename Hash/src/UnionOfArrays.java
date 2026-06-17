import java.util.*;
public class UnionOfArrays {
    public static int union(int [] num,int []num2){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<num.length;i++){
            set.add(num[i]);
        } for(int j = 0;j<num2.length;j++){
            set.add(num2[j]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int [] arr1 = {4,3,5,6};
        int [] arr2 = {4,3,5,6,7,8,4,5};
        System.out.println(union(arr1,arr2));
    }
}
