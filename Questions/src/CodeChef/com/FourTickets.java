package CodeChef.com;

import java.util.Scanner;

public class FourTickets {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int price  = sc.nextInt() *4 ;
        if(price>1000){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }

    }
}
