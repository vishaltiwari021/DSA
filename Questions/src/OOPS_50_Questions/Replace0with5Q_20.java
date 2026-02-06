package OOPS_50_Questions;

import java.util.Scanner;

public class Replace0with5Q_20 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String []str =sc.next().split("");
        int [] num = new int[str.length];
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(str[i]);
                if(num[i]==0){
                    num[i]=5;
                }
                System.out.print(num[i]);
            }



    }
}
