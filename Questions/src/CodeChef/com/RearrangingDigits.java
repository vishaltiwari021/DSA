package CodeChef.com;

import java.util.Scanner;

public class RearrangingDigits {
    // Rearranging digits to get a multiple of 5
    public static void main(String[] args) {//question not done yet
        Scanner sc  = new Scanner(System.in);
        int number  = sc.nextInt();
        if(number%5==0){
            System.out.println("yes");
        }
        else{
            checkdevisibility(number);
        }

    }
    public static void checkdevisibility(int number){
        if(number%5!=0){
            int rem = number%10;
            number/=10;
            int newnumber  = rem*100 + number;
            if(newnumber%5==0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}
