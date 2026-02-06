package CodeChef.com;

import java.util.Scanner;

public class ChefPlaysLudo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int dice = sc.nextInt();
        if(dice>6){
            System.out.println("please enter the number b/w range 1to6");
        }
       else if(dice!=6){
            System.out.println("NO");
        }
        else{
            System.out.println("yes");
        }
    }
}
