import java.util.ArrayList;

public class MultiDArrayList {
    public static void main(String[] args) {
        //Creating a 2d ArrayList:
        ArrayList<ArrayList<Integer>> mainList  = new ArrayList<>();
        ArrayList<Integer> list  = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        mainList.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(4);
//        list2.add(5);
//        mainList.add(list2);
        ArrayList<Integer> list3 = new ArrayList<>();
//        list3.add(8);
//        list3.add(9);
//        mainList.add(list3);
        for(int k =1; k<=5; k++){
            list.add(1*k);
            list2.add(2*k);
            list3.add(3*k);
        }
        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j));
            }
            System.out.println();
        }
    }
}
