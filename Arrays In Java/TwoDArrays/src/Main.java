//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void SpiralMatrix(int[][] matric){
        int startRow  = 0;
        int endRow  = matric.length-1;
        int startCol= 0;
        int endCol = matric[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //top:
            for(int i=startCol ;i<=endCol;i++){
                System.out.println(matric[startRow][i]+" ");
            }
            //right
            for(int j = startRow+1;j<=endRow;j++){
                System.out.println(matric[j][endCol]);
            }
            //bottom:
            for(int i =endCol-1 ;i>=startRow;i--){
                if(startRow == endRow){
                    break;
                }
                System.out.println(matric[endRow][i]);
            }
            //left
            for(int j=endRow-1;j>=startRow+1;j--){
                if(startCol == endCol){
                    break;
                }
                System.out.println(matric[j][startRow]);
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
    int [][] matric = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    SpiralMatrix(matric);
    }
}