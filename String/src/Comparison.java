public class Comparison {
    public static void main(String[] args) {
        String  name  = "Vishal";
        String  name2  = "Vishal";
        System.out.println(name == name2);//its check the value and reference.
        //creating new objects:
        String a = new String("hariOm");
        String b = new String("hariOm ");
        System.out.println(a.equals(b));//its check only value.
        System.out.println(a.charAt(0));
    }
}
