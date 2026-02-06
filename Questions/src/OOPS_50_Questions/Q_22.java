package OOPS_50_Questions;

import java.util.Scanner;

public class Q_22 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int k = sc.nextInt();//pay k dollars for each banana.
        int n = sc.nextInt();//he has n dollars to buy banana.
        int w = sc.nextInt();// w bananas solider  want to buy.
        int cost  = 0;
        for (int i = 1; i <=w; i++) {
            cost  = cost  + (i*k);
        }
        if(cost>n){
            System.out.println(cost-n);
        }
        else {
            System.out.println(0);
        }
    }
}
