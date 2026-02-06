package Functions;

public class SwapOfValue {
    public static void main(String[] args) {
        swap();
    }
    public static void swap(){
        int a  =5;
        int b=6;
         int temp =a;
         a=b;
         b =temp;
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }

}
