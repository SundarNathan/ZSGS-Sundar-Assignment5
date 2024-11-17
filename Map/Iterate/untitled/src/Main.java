import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> tm= new TreeMap<>();

        tm.put("banana", 2);
        tm.put("apple", 5);
        tm.put("cherry", 7);
        tm.put("date", 3);

        Iterator<Map.Entry<String,Integer>> it= tm.entrySet().iterator();

        while(it.hasNext());
        {
            Map.Entry<String,Integer> en= it.next();
            System.out.println(en.getKey()+": "+en.getValue());

        }
        
    }
}