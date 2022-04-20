package chapter13_Generics.listing14;
// An exception for queue-empty errors.
public class QueueEmptyException extends Exception {
    @Override
    public String toString() {
        return "Queue is empty.";
    }
}
