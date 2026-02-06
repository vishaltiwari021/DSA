package Functions;

import java.util.Scanner;

public class GreaterNUmber {
    public static  void greaterNumber(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
        greeting();
    }
    public static void greeting(){
        System.out.println("Namshte Uncle Ji");
    }
    public static void main(String[] args) {
        greaterNumber();

    }
}
