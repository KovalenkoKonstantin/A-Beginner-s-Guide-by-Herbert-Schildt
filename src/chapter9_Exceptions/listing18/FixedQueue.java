package chapter9_Exceptions.listing18;

/* Try This 9-1 add exception handling to the queue classes.*/
import chapter9_Exceptions.listing16.*;
import chapter9_Exceptions.listing17.*;
import chapter9_Exceptions.listing20.*;
// A fixed-size queue class for characters that uses exceptions.
public class FixedQueue implements ICharQ {
    private char q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue given its size.
    public FixedQueue(int size) {
        q = new char [size]; // allocate memory for queue
        putloc = getloc = 0;
    }
    // Put a characer into the queue.
    @Override
    public void put(char ch)
            throws QueueFullException {

        if(putloc==q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = ch;
    }
    // Get a character from the queue.
    @Override
    public char get()
            throws QueueEmptyException {

        if(getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }
}