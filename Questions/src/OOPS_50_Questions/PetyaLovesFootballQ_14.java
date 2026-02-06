package OOPS_50_Questions;

import java.util.Scanner;

public class PetyaLovesFootballQ_14 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str  = sc.next();
        if(str.contains("1111111") || str.contains("0000000")){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
}
