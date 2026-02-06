package OOPS_50_Questions;

import java.util.Scanner;

public class CelsiusToFahrenheitQ_18 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int f_min = sc.nextInt();//min f
        int f_max = sc.nextInt();//max f
        int step  = sc.nextInt();//number of steps
        int cel ;
        for (int i = f_min; i <=f_max ; i= i+step) {
            cel = (int)((5.0/9.0)*(i-32));//formula of cel
            System.out.println(i+" "+cel);
        }

    }
}
