package chapter8_Interfaces.listing15;

import chapter8_Interfaces.listing13.*;

// A circular queue.
public class CircularQueue implements ICharQ {
    private char q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue given its size.
    public CircularQueue(int size) {
        q = new char[size+1]; // allocate memory for queue
        putloc = getloc = 0;
    }

    @Override
    // Put a character into the queue.
    public void put(char ch) {
    /* Очередь считается полной, если индекс putloc на единицу
меньше индекса getloc или если индекс putloc указывает
на конец массива, а индекс getloc - на его начало
        if(putloc+1==getloc |
                ((putloc==q.length-1) & (getloc==0))) {
            System.out.println(" -- Queue is full.");
        }*/
        q[putloc++] = ch;
        if(putloc==q.length) putloc = 0; // loop back
    }

    @Override
    // Get a character from the queue.
    public char get() {
/*        if(getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }*/
        char ch = q[getloc++];
        if(getloc==q.length) getloc = 0; // loop back
        return ch;
    }
}
