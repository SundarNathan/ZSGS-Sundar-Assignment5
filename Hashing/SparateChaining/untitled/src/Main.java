import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

class HashTable{

    private static class Node{
        int key;
        String value;

        Node(int key, String value)
        {
            this.key=key;
            this.value=value;
        }
    }

    LinkedList<Node>[] table;
    int capacity;

    public HashTable(int capacity){
        this.capacity= capacity;
        table = new LinkedList[capacity];

        for(int i=0;i<capacity;i++)
        {
            table[i]= new LinkedList<>();
        }
    }

    int hash(int key)
    {
        return key%capacity;
    }

    public void put(int key, String value)
    {
        int index=hash(key);
        LinkedList<Node> chain= table[index];

        for(Node node: chain)
        {
            if(node.key==key)
            {
                node.value=value;
                return;
            }
        }

        chain.add(new Node(key, value));
    }

    public String get(int key)
    {
        int index= hash(key);
        LinkedList<Node> chain= table[index];

        for(Node node: chain)
        {
            if(node.key==key)
            {
                return node.value;
            }
        }

        return null;
    }


}
public class Main {
    public static void main(String[] args) {

        HashTable h= new HashTable(10);
        h.put(10, "Sundar");

        System.out.println(h.get(10));
    }
}