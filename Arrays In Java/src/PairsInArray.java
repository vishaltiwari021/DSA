public class PairsInArray {
    public  static  void pairsOfArray(int[]arr ){
        int totalPairs  = 0;
        for (int i = 0; i < arr.length; i++) {
            int current  = arr[i];
            for (int j =i+1; j<arr.length;j++){
                System.out.print("(" + current + "," + arr[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs : " + totalPairs);
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        pairsOfArray(arr);

    }
}
