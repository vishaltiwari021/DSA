public class EvenOdd {
    public static void checkEvenOdd(int n ){
        int maskBit  =1;
        if((n&maskBit) == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        checkEvenOdd(11);
        checkEvenOdd(113);
        checkEvenOdd(4);
    }
}
