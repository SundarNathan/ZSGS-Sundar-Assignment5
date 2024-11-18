import java.util.ArrayList;
import java.util.Map;

class RehashingHashTable{
    private static class Entry
    {
        int key;
        String value;

        Entry(int key, String value)
        {
            this.key=key;
            this.value=value;
        }
    }

    ArrayList<Entry>[] table;
    int capacity;
    int size;
    final double loadFactor=0.75;

    RehashingHashTable(int capacity)
    {
        this.capacity=capacity;
        this.size=0;
        this.table= new ArrayList[capacity];
        for(int i=0;i<capacity;i++)
            table[i]= new ArrayList<>();
    }

    int hash(int key)
    {
        return key%capacity;
    }

    void put(int key, String value)
    {
        if(getLoad()>loadFactor)
        {
            rehash();
        }

        int index= hash(key);
        ArrayList<Entry> chain= table[index];

        for(Entry en:chain)
        {
            if(en.key==key)
            {
                en.value=value;
                return ;
            }
        }

        chain.add(new Entry(key, value));
        size++;
    }

    String get(int key)
    {
        int index= hash(key);
        ArrayList<Entry> chain= table[index];

        for(Entry en:chain)
        {
            if(en.key==key)
                return en.value;
        }

        return null;

    }

    double getLoad(){
        return (double) size/capacity;
    }

    void rehash(){

        System.out.println("rehashing");
        int oc=capacity;
        ArrayList<Entry>[] ot= table;
        capacity*=2;
        table= new ArrayList[capacity];

        for(int i=0;i<table.length;i++)
            table[i]= new ArrayList<>();

        size=0;

        for(int i=0;i<ot.length;i++)
        {
            for(Entry en:ot[i])
            {
                put(en.key,en.value);
            }
        }
    }

    void display(){
        for (int i = 0; i < capacity; i++) {
            System.out.print("Index " + i + ": ");
            for (Entry entry : table[i]) {
                System.out.print("{" + entry.key + ": " + entry.value + "} -> ");
            }
            System.out.println("null");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        RehashingHashTable hashTable = new RehashingHashTable(4);

        hashTable.put(1, "One");
        hashTable.put(2, "Two");
        hashTable.put(3, "Three");
        hashTable.put(4, "Four");
        hashTable.put(5, "Five");
        hashTable.put(6, "Five");
        hashTable.put(7, "Five");
        hashTable.put(8, "Five");

        hashTable.display();
        System.out.println("Hello world!");
    }
}