package chapter9_Exceptions.listing20;

import chapter9_Exceptions.listing16.*;
import chapter9_Exceptions.listing17.*;

// A character queue interface that throws exceptions.
public interface ICharQ {
    // Put a characer into the queue.
    void put(char ch) throws QueueFullException;

    // Get a character from the queue.
    char get() throws QueueEmptyException;
}