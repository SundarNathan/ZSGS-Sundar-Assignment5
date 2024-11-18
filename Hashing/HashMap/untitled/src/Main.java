import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Character> map= new HashMap<>();

        map.put("John",'A');
        map.put("Sundar",'B');
        map.put("Jane",'C');
        map.put("Peter",'D');
        map.put("John",'E');
        System.out.println(map);
    }
}