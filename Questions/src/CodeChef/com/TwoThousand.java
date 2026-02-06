package CodeChef.com;

import java.util.Scanner;

public class TwoThousand {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //N number of notes;
        int number  = sc.nextInt();
        //total amount by n*2000;
        int totalRupees  = number * 2000;
        //how many number of 500 notes;
        int fiveHundred = totalRupees/500;
        System.out.println(fiveHundred);
        //ex :- n=4 and 500 notes = 16.

    }
}
