package Functions;

public class DecimalToBinary {
    public static  void decTobin(int n){
        int muNum =n;
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n%2;
            binNum = binNum +(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of "+ muNum +"="+binNum);
    }
    public static void main(String[] args) {
    decTobin(9);
    }
}
