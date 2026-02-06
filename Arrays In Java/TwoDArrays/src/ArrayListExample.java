import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        //Syntax:
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(45);
//        list.add(5);
//        list.add(4);
//        list.add(47);
//        list.add(48);
//        list.add(40);
//        System.out.println(list);
//        list.set(1,3);
//        list.remove(4);
//        System.out.println(list);

        // take input like this :
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
            System.out.println(list.get(i));
        }
//        System.out.println(list);
    }
}
