package OOPS_50_Questions;

import java.util.Scanner;

public class IdenticalStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string one");
        String str  = sc.nextLine();
        System.out.println("Enter string two");
        String str1  = sc.nextLine();
        System.out.println(str.equals(str1));
    }
    public static boolean same(String str,String str1){
        if(str.length()!= str1.length()){
           return false;
        }
        else{
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)!=str1.charAt(i)){
                    return false;
                }
            }

        }
        return true;
    }
}
