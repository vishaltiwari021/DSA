public class IsPowerOfTwo {
    public static boolean powerOfTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(powerOfTwo(4));
        System.out.println(powerOfTwo(15));
    }
}
