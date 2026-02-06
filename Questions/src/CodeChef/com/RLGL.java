package CodeChef.com;

import java.util.Arrays;
import java.util.Scanner;

public class RLGL {
    public static void main(String[] args) {//question not done yet
        Scanner sc  = new Scanner(System.in);
        int count =0;
        int numberOfPlayers = sc.nextInt();
        int [] height = new int [numberOfPlayers];
        for (int i = 0; i < height.length; i++) {
                 height[i] =sc.nextInt();
                 if(height[i]!=height[i+1]){
                     count++;
                 }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(height));
    }
}
