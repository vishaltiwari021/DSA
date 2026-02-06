package OOPS_50_Questions;

import java.util.Scanner;

public class Q_23 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();//number of car are running on road.
        int sum = 0 ;
        int[] arr  = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(i%2==0){
                sum  = sum + arr[i];
                    if(sum%4==0 || sum%3==0) System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
        }

    }
}
