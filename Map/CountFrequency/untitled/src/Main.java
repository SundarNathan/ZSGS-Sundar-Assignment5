import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s= "akdjfkjdfk";

        HashMap<Character, Integer> map= new HashMap<>();

        for(char c: s.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
    }
}