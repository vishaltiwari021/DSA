package Functions;

public class BinaryToDecimal {
    public static void binToDec(int n){
        //0010
        int newNum = n;
        int pow = 0;
        int decimal = 0;
        while(n>0){
            int lastDigit = n%10;
            decimal = decimal +(lastDigit * (int)Math.pow(2,pow));
            pow++;
            n =n/10;
        }
        System.out.println("decimal of " + newNum + " = " + decimal);
    }
    public static void main(String[] args) {
    binToDec(0011);
    }
}
