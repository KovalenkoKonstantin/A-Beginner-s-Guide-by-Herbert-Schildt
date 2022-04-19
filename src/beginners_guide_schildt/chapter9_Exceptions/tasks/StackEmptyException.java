package beginners_guide_schildt.chapter9_Exceptions.tasks;

// An exception for queue-empty errors.
public class StackEmptyException extends Exception {
    @Override //from Object
    public String toString() {
        return "Stack is empty.";
    }
}