import java.util.*;
public class DequeImplementation {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);//1
        deque.addFirst(2);//2 1
        deque.addLast(3);//2 1 3
        deque.addLast(4);// 2 1 3 4
        deque.addLast(5);// 2 1 3 4 5
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        System.out.println("first el :" + deque.getFirst());
        System.out.println("last el :" + deque.getLast());
    }
}
