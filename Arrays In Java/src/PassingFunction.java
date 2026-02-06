import java.util.Arrays;

public class PassingFunction {
    public static void update(int[]marks){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int[]  marks  = {22,33,44};
        update(marks);
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]+" ");
//        }
        System.out.println(Arrays.toString(marks));
    }

}
