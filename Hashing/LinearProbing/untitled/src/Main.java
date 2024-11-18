
class LinearProbingHashTable{
    private static class Entry{
        int key;
        String value;
        boolean isDeleted;

        Entry(int key, String value)
        {
            this.key= key;
            this.value= value;
            isDeleted=false;
        }
    }

    Entry[] table;
    int capacity;
    int size;

    LinearProbingHashTable(int capacity)
    {
        this.capacity=capacity;
        this.table= new Entry[capacity];
        this.size=0;
    }

    int hash(int key)
    {
        return key%capacity;
    }

    void put(int key, String value)
    {
        if(size==capacity)
            return;
        int index= hash(key);

        while(table[index]!=null&&!table[index].isDeleted&&table[index].key!=key)
            index=(index+1)%capacity;

        if(table[index]==null||table[index].isDeleted)
        {
            size++;
        }
        table[index]=new Entry(key, value);
    }

    String get(int key)
    {
        int index= hash(key);
        int start=index;

        while(table[index]!=null)
        {
            if(!table[index].isDeleted&&table[index].key==key)
                return table[index].value;

            index=(index+1)%capacity;
            if(index==start)
                break;
        }
        return null;

    }

    void remove(int key)
    {
        int index= hash(key);
        int start=index;

        while(table[index]!=null) {
            if (!table[index].isDeleted && table[index].key == key) {
                table[index].isDeleted = true;
                size--;
                return;
            }
            index=(index+1)%capacity;
            if(index==start)
                return;
        }

    }
}
public class Main {
    public static void main(String[] args) {
        LinearProbingHashTable lht= new LinearProbingHashTable(10);

        lht.put(10,"Sundar");

    }
}