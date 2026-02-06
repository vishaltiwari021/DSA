import java.util.ArrayList;

//ArrayList:--
//Are dynamic size, and it stores non-primitive DataStructure:
public class Main {
    public static void main(String[] args) {
        //you can make arraylist of Integer | String | Boolean ect...
        ArrayList<Integer> list  = new ArrayList<>();
        //Operations: AddElementO(1), GetElementO(1), RemoveElementO(n),SetElementO(n), ContainElementO(n)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        //System.out.println(list);
        //----- at particular index value-----
         int ele = list.get(2);
        //System.out.println(ele);
        //----------------------------------
        //Delete/Remove:
        list.remove(1);
        //System.out.println(list);
        //----------------------------------
        //Set
        list.set(1,5);
        //System.out.println(list);
        //Element is exist or not------
       // System.out.println(list.contains(3));
       // System.out.println(list.contains(6));
        //--------------------
        //add element at particular indexO(n):
        list.add(1,2);
        //System.out.println(list);
//----Size of AL----
        System.out.println(list.size());
// print the arraylist/for iteration:
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
//print reverse of Al:
        for (int i = list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}