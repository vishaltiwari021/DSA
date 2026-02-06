package Functions;

public class Questions {
    public static int average(int n,int m,int p){
       int avg = (n+m+p)/3;
       return avg;
    }
    public static void palindrome(int n) {
        int originL = n;
        int rem = 0;
        while (n > 0) {
           int num = n % 10;
            rem = rem*10 + num;
            n = n / 10;
        }
        if(originL==rem){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    public static void isEven(int n){
        int original =n;
        if(original%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static int sumOfDigit(int n){
        n = Math.abs(n);
        int empty = 0;
        while(n>0){
            int digit = n%10;
            empty = empty + digit;
            n =n/10;
        }
        return empty;
    }

    public static void main(String[] args) {
//        System.out.println(average(1,2,3));
//        palindrome(121);
//        isEven(6);
        System.out.println( sumOfDigit(123));
    }
}
