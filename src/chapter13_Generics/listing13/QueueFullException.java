package chapter13_Generics.listing13;
// An exception for queue-full errors.
public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int s) { size = s; }
    @Override
    public String toString() {
        return "Queue is full. Maximum size is " +
                size;
    }
}
