package CodeChef.com;

import java.util.Scanner;

public class SummerTime {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int temperature  = sc.nextInt();
        if(temperature<=35){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}