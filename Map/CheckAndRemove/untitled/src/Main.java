import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String , Integer> map= new HashMap<>();

        map.put ("John", 85);
        map.put("Jane", 92);
        map.put("Tom", 76);
        map.put("Lucy", 89);

        if(map.containsKey("Tom"))
            map.remove("Tom");
    }
}