import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        map.put("Diana", 28);
        map.put("Edward", 40);

        System.out.println(map.get("Charlie"));

        Iterator<Map.Entry<String,Integer>> it= map.entrySet().iterator();

        while(it.hasNext())
        {
            Map.Entry<String, Integer> en=it.next();
            System.out.println(en.getKey()+": "+en.getValue());
        }

    }
}