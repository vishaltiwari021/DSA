import java.util.*;
public class Main {
    public static void guessNumber(){
        System.out.println("Guessing Game :");
        System.out.println("You have only 5 try to guess a number");
    }

    public static void main(String[] args) {
        guessNumber();
        int guessNO = (int)(Math.random() * 10 ) + 1;
        int chances  = 5;
        //user guess the number
        System.out.println("Try to Guess a Number between 1 to 10 :");
        Scanner sc = new Scanner(System.in);

        while(chances > 0){
            System.out.println("Enter your guess : ");
            int number  = sc.nextInt();
            //check 1
            if(number == guessNO){
                System.out.println("You are correct! The number was: " + guessNO);
                sc.close();
                return;
            }
            //check 2 :close to guess number
            if (Math.abs(number - guessNO) == 1) {
                System.out.println("You are incredibly close! Just 1 digit away.");
            }
            //check 3
            if(number < guessNO){
                System.out.println("guess is to low");
            } else if (number > guessNO) {
                System.out.println("guess is to high");
            }
            chances--;

            if(chances > 0){
                System.out.println("Chances left: " + chances);
                System.out.println("-------------------------");
            }

        }
        System.out.println("Better luck next time! The correct number was: " + guessNO);
        sc.close();


    }
}
