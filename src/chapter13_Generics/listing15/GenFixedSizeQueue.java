package chapter13_Generics.listing15;

import chapter13_Generics.listing12.IGenQ;
import chapter13_Generics.listing13.QueueFullException;
import chapter13_Generics.listing14.QueueEmptyException;

// A generic, fixed-size queue class.
public class GenFixedSizeQueue<T> implements IGenQ<T> {
    private T q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue with the given array.
    public GenFixedSizeQueue(T [] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    // Put an item into the queue.
    @Override
    public void put(T obj)
            throws QueueFullException {

        if(putloc==q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = obj;
    }

    // Get a character from the queue.
    @Override
    public T get()
            throws QueueEmptyException {

        if(getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }
}
