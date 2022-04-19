package beginners_guide_schildt.chapter8_Interfaces.tasks.qpack;

// A character queue interface.
public interface ICharQ {
    // Put a characer into the queue.
    void put(char ch);

    // Get a character from the queue.
    char get();
}
