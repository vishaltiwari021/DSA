package Functions;

import java.util.Scanner;

public class SumOfNumber {
    public static int calculateSum(int a ,int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 =sc.nextInt();
       calculateSum(num1,num2);

    }
}
