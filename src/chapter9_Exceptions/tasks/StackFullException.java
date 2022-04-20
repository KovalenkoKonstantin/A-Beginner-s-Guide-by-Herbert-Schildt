package chapter9_Exceptions.tasks;

// An exception for queue-full errors.
public class StackFullException extends Exception {
    int size;

    public StackFullException(int s) { size = s; }
    @Override //from Object
    public String toString() {
        return " -- Stack is full. Maximum size is " + size;
    }
}
