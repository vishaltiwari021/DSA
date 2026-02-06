package Functions;

public class BinaryToDecimal {
    public static void binToDec(int n){
        int newnum =n;
        int pow =0;
        int decimal =0;
        while(n>0){
            int lastdigit = n%10;
            decimal = decimal +(lastdigit* (int)Math.pow(2,pow));

            pow++;
            n =n/10;
        }
        System.out.println("decimalof" + newnum +" = "+decimal);
    }
    public static void main(String[] args) {
    binToDec(101);
    }
}
