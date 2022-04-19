package beginners_guide_schildt.chapter13_Generics.listing15;
import beginners_guide_schildt.chapter13_Generics.listing12.IGenQ;;

public class GenerateCircularQueue<T> implements IGenQ <T> {
    private T q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue given its size.
    public GenerateCircularQueue(T [] aRef) {
        q = aRef; // allocate memory for queue
        putloc = getloc = 0;
    }

    @Override
    // Put a character into the queue.
    public void put(T obj) {
/* Очередь считается полной, если индекс putloc на единицу
меньше индекса getloc или если индекс putloc указывает
на конец массива, а индекс getloc - на его начало*/
        q[putloc++] = obj;
        if(putloc==q.length) putloc = 0; // loop back
    }

    @Override
    // Get a character from the queue.
    public T get() {
        if(getloc==q.length) getloc = 0; // loop back
        return q[getloc++];
    }
}
