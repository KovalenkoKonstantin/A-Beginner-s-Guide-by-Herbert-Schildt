package chapter13_Generics.listing12;

import chapter13_Generics.listing13.QueueFullException;
import chapter13_Generics.listing14.QueueEmptyException;

// A generic queue interface.
public interface IGenQ<T> {
    // Put an item into the queue.
    void put(T ch) throws QueueFullException;

    // Get an item from the queue.
    T get() throws QueueEmptyException;
}