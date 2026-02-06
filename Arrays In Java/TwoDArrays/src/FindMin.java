public class FindMin {
    public static void main(String[] args) {
        int [] num = {12,3,5,7,8,99,56};
        System.out.println(min(num));
    }
    static int min(int[]num){
        int min  = num[0];
        for (int i = 0; i < num.length; i++) {
            if(min>num[i]){
                min = num[i];
            }
        }
        return min;
    }
}
