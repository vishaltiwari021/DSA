import java.util.ArrayList;

public class MostWater {
    public static void main(String[] args) {
        //LeetCode 11:
        ArrayList<Integer> height = new ArrayList<>();
        //height = [1,8,6,2,5,4,8,3,7]
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWaterOptimization(height));
    }
    public static int storeWater(ArrayList<Integer> height){
        //Brute Force: TC: O(n^2)
        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                // area  = height * width
                int area = Math.min(height.get(i), height.get(j)) * (j-i);
                maxWater = Math.max(maxWater,area);
            }
        }
        return maxWater;
    }
    public static int storeWaterOptimization(ArrayList<Integer> height){
        //Using Two pointer:
        int left  = 0;
        int right = height.size()-1;
        int maxWater = 0;
        while(left<right){
            //calculate water area:
            int ht = Math.min(height.get(left), height.get(right));
            int wd = right-left;
            int area  = ht*wd;
            maxWater = Math.max(maxWater,area);
            //update pointer:
            if(height.get(left)< height.get(right)){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}
