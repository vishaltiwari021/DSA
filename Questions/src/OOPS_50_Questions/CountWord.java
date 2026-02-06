package OOPS_50_Questions;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(SentenceCount(str));
    }
    public static int SentenceCount(String str){
       String[]words = str.split("\\s+");
       return words.length;
    }
}
