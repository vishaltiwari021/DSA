package OOPS_50_Questions;

import java.util.Scanner;

public class SumOfOddAndEvenPlaceQ_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String[] str  = sc.next().split("");
        long N  = sc.nextLong();
        int oddsum  = 0;
        int evensum  = 0;
        int position  = 1;
       while(N>0){
           int digit  = (int)(N%10);
           if(position %2 ==1){
               oddsum+= digit;
           }
           else {
               evensum+= digit;
           }
           position++;
           N/= 10 ;
       }
        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
