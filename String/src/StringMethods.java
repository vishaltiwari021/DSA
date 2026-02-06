import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name  = "Vishal Tiwari";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('T'));
        System.out.println(    "vihsal  ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
