import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list  = new LinkedList<>();
        list.addLast(5);
        list.add(1);
        list.addFirst(0);
        System.out.println(list);
        list.remove();
        System.out.println(list);
    }
}
