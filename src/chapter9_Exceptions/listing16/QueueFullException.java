package chapter9_Exceptions.listing16;

// An exception for queue-full errors.
public class QueueFullException extends Exception {
    int size;

    public QueueFullException(int s) { size = s; }
    @Override //from Object
    public String toString() {
        return " -- Queue is full. Maximum size is " +
                size;
    }
}
