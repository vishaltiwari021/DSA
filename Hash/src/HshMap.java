import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Topic Is HashMap: this is used to store the pairs :- key->value pair
//HashMap are unorder in nature like HashSet.
public class HshMap {
    public static void main(String[] args) {
        //Creation:
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion:
        map.put("india",90);
        map.put("china",100);
        map.put("us",30);
        map.put("russia",60);
        System.out.println(map);
        //Search:
        if(map.containsKey("india")){
            System.out.println("key is present");
        }else{
            System.out.println("key is not present");
        }
        //value of particular key:
        System.out.println(map.get("us"));//key is present
        System.out.println(map.get("uk"));//key is not present
        //Iterations:
        for(Map.Entry<String,Integer> e :map.entrySet()){
            System.out.println(e.getKey() + "->"+ e.getValue());
        }
        //remove:
        map.remove("china");
    }
}
