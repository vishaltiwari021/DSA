import java.util.*;

public class Itenerary {
    public static String getStart(HashMap<String,String> ticket){
        HashMap<String,String> revMap = new HashMap<>();

        for(String key : ticket.keySet()){
            revMap.put(ticket.get(key),key);
        }
        for(String key : ticket.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("C","B");
        map.put("M","D");
        map.put("G","C");
        map.put("D","G");

        String start = getStart(map);

        while(map.containsKey(start)){
            System.out.print(start+"->");
            start = map.get(start);
        }
        System.out.print(start);
    }
}
