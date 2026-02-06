package Loops;
import java.sql.SQLOutput;
import java.util.Scanner;
public class PrintAP {
    public static void main(String[] args) {
        //Series OF AP -> 1,3,5,7,9....
        //Formula of AP a = a+(n-1)*d : a = first term; d = common difference
        Scanner sc =new Scanner(System.in);
        System.out.println("up-to how many terms:");
        int number = sc.nextInt();
//        for (int i =1;i<=(2*number-1);i+=2){
//            System.out.println(i);
//        }
        //Method 2 for AP of any:
        System.out.println("enter the first number:");
        int FirstTerm = sc.nextInt();
        System.out.println("enter the common-differ:");
        int commonDifference = sc.nextInt();
        for (int i=1;i<=number;i++){
            System.out.println(FirstTerm+" ");
            FirstTerm += commonDifference;
        }
    }
}
