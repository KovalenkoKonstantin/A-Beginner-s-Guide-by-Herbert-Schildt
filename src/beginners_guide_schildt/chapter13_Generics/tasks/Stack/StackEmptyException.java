package beginners_guide_schildt.chapter13_Generics.tasks.Stack;

// An exception for queue-empty errors.
public class StackEmptyException extends Exception {
    @Override //from Object
    public String toString() {
        return "Stack is empty.";
    }
}