package beginners_guide_schildt.chapter9_Exceptions.listing17;

// An exception for queue-empty errors.
public class QueueEmptyException extends Exception {
    @Override //from Object
    public String toString() {
        return "Queue is empty.";
    }
}