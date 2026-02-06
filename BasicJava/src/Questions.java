import java.util.*;
public class Questions {
    public static void main(String[] args) {
        //Basic Sum Problem in Java By Input ::
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number :");
        int  a  = sc.nextInt();
        System.out.print("enter the second number :");
        int b = sc.nextInt();
        int result = a+b;
        System.out.println("Ans of the input value :" + result);

        //What is the area of circle ::
        System.out.print("Enter the radius of circle:");
        float r = sc.nextFloat();
        float area  =(float)(Math.pow(r,r)*3.14);
        System.out.println("Area of circle:" + area);

    }
}
