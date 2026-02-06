import java.util.*;
public class Conditionals {
    public static void main(String[] args) {
        //Voting Condition if age>=18 person are allow to vote
//        System.out.println("Enter the age according to your adharCard ");
        Scanner sc = new Scanner(System.in);
       // int age  = sc.nextInt();
//        if(age>=18){
//            System.out.println("You are eligeble for vote :" + age);
//        }
//        else{
//            System.out.println("You are not eligble for vote:" + age);
//        }
//************************************************************************************
        //Largest among 3:
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c  = sc.nextInt();
//
//        if ((a>=b) && (a>=c)){
//            System.out.println("A is greater number" + a);
//        } else if (b>=c) {
//            System.out.println("B is greater number" +b);
//        }
//        else {
//            System.out.println("C is gretater number" + c);
//        }
// ******************************************************************
        //Ternary:
//        System.out.println("Find the number is even or odd ?");
//        int number = sc.nextInt();
//        String  value  = (number % 2 == 0)?"even":"odd";
//        String result = (number>=33)?"pass":"fail";
//        System.out.println("Your number is :" + result);
//**********************************************************************
        //Switch
        char ch  = 'A';
        switch (ch){
            case 'N' :
                System.out.println("noob");
                    break;
            case 'S' :
                System.out.println("smart");
                    break;
            case 'A' :
                System.out.println("Apple");
                    break;
            default:
                System.out.println("get out from here");
        }
    }
}
