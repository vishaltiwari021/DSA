public class DiagonalSum {
public static  int diagonalSum(int[][]matric){
    int sum =0 ;
//    for (int i = 0; i < matric.length; i++) {
//            for(int j =0;j<matric[0].length;j++){
//                if (i == j) {
//                    sum+= matric[i][j];
//                }
//                else if(i+j == matric.length-1){
//                    sum+= matric[i][j];
//                }
//            }
//    }
    //time complexity of above code is O(n^2)..
    //--------------------------------------------------------
    for(int i =0 ;i< matric.length;i++){
        //pd
        sum+= matric[i][i];
        //sd
        if(i!= matric.length-i-1) {
            sum += matric[i][matric.length - i - 1];//int n = matric.length value of n =4(size of matric)
        }
    }

//time complexity of above code is O(n)..
    return sum;
}

    public static void main(String[] args) {
        int [][] matric = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalSum(matric));
    }
}
