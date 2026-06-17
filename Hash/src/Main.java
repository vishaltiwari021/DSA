import java.util.HashSet;
import java.util.Iterator;
//Topic Is HashSet:
public class Main {
    public static void main(String[] args) {
    //Creating:
        HashSet<Integer> set = new HashSet<>();
        //Insert:
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(1);
        //print:
        System.out.println(set);
        //Search :- contains

        if(set.contains(1)){
            System.out.println("yes");
        }else{
            System.out.println("NO");
        }
        //Iterator:
        Iterator it  = set.iterator();
        //there are two function in this iterator:hasNext and next;
        while(it.hasNext()){
            System.out.println(it.next());
        }
     }
}
