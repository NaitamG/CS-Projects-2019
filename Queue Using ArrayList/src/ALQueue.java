import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ALQueue<E> implements Queue<E> {
    ArrayList<E> list = new ArrayList<E>();
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public void enqueue(E data) {
        list.add(data);
        tail = (tail + 1) % list.size();
        size++;
    }

    public E dequeue() {
        if(list.isEmpty()) {
            throw new NoSuchElementException("Empty queue, cannot remove any further.");
        }
        E data = list.get(head);
        list.set(head, null);
        head = (head + 1) % list.size();
        size--;
        return data;
    }
    public int size() {
        return size;
    }
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}

