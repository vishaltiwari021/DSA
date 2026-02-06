package OOPS_50_Questions;

import java.util.Scanner;

public class CapitalizationQ_13 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str  = sc.nextLine();
        if(str.charAt(0)>=97 && str.charAt(0)<=122){
           // str  = (char)(str.charAt(0)-32) + str.substring(1);//logic one
            str  = str.substring(0,1).toUpperCase()+ str.substring(1);//logic two
            System.out.println(str);
        }
        else {
            System.out.println(str);
        }
    }
}
