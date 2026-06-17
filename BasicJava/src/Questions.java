import java.util.*;
public class Questions {
    public static int factorial(int n){
        int fact  = 1;
        for(int i = n ; i>0; i--){
            fact  =  fact * i;
        }
        return fact;
    }
    public static int fibonacci(int k){
        // 0,1,1,2,3,5,8,13....
        if(k <= 1){
            return k;
        }
        return fibonacci(k-1) + fibonacci(k-2);
    }

    public static void main(String[] args) {
//        System.out.println("factorial calculator");
        Scanner sc  = new Scanner(System.in);
//        System.out.print("find factorial of number : ");
//        int m = sc.nextInt();//5 = 5*4*3*2*1 = 120;
//        factorial(m);

        int terms = sc.nextInt();
        System.out.println("Fibonacci Sequence up to " + terms + " terms:");
        for(int i = 0; i< terms; i++){
            System.out.println(fibonacci(i));
        }
    }
}
