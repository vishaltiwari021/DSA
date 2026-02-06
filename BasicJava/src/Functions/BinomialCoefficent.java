package Functions;

public class BinomialCoefficent {
    public static int factorial(int num){
        int f =1;
        for(int i =1;i<=num;i++){
            f*=i;
        }
        return f;
    }

    public static int binomialcoefficent(int n,int r){
        int n_fac = factorial(n);
        int r_fac =factorial(r);
        int nmr_fac =factorial(n-r);
         int bin_coef = n_fac/(r_fac*nmr_fac);
         return bin_coef;
    }
    public static void main(String[] args) {
        System.out.println(binomialcoefficent(5,2));
    }
}
