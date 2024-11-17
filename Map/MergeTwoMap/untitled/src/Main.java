import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Character, Integer> map1=new HashMap<>();
        map1.put('a',1);
        map1.put('b',2);

        HashMap<Character, Integer> map2=new HashMap<>();
        map2.put('b',3);
        map2.put('c',4);

        map1.putAll(map2);
        System.out.println(map1);
    }
}