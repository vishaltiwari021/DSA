package OOPS_50_Questions;

import java.util.Scanner;

public class SearchCharacter {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str  = sc.next();//input string
        char ch  = sc.next().charAt(0);//targeted element.
        System.out.println(searchChar(str,ch));

    }
    public static int searchChar(String str,char ch){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== ch){
             return i;
            }
        }
        return -1;
    }
}
