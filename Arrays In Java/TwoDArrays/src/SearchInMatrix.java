public class SearchInMatrix {
    public  static boolean StaircaseSearch(int[][]matric,int key){
        int row = 0;
        int col = matric[0].length-1;
        while(row< matric.length && col>=0){
        if(matric[row][col] == key){
            System.out.println("key found at (" + row + "," + col + ")");
            return true;
        } else if (key<matric[row][col]) {
            col--;
        } else{
            row++;
        }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int [][] matric = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key  = 33;
        StaircaseSearch(matric,key);
    }
}
