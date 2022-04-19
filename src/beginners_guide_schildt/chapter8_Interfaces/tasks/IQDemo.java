package beginners_guide_schildt.chapter8_Interfaces.tasks;
import beginners_guide_schildt.chapter8_Interfaces.tasks.qpack.*;

// Demonstrate the ICharQ interface.
class IQDemo {
    public static void main(String args[]) {

        int a = 10, b = 5, c = 10, d = 10, i;

        /**1*/
        //создание объекта класса FixedQueue
        FixedQueue q1 = new FixedQueue(a);
        // Put some characters into fixed queue.
        for(i=0; i < a; i++)
//используется метод put() из FixedQueue
            q1.put((char) ('A' + i));//пробегаемся по массиву от А до J
        // ShowInputFromKeyboard the queue.
        System.out.print("1. Contents of fixed queue: ");
        for(i=0; i < a; i++)
//используется метод get() из FixedQueue
            System.out.print(q1.get());
        System.out.println("\n");

        /**2*/
        //создание объекта класса DynQueue
        DynQueue q2 = new DynQueue(b);
        // Put some characters into dynamic queue.
        for(i=0; i < 10; i++)
            q2.put((char) ('Z' - i));
        // ShowInputFromKeyboard the queue.
        System.out.print("2. Contents of dynamic queue: ");
        for(i=0; i < 10; i++)
            System.out.print(q2.get());
        System.out.println("\n");

        /**3*/
        //создание объекта класса CircularQueue
        CircularQueue q3 = new CircularQueue(c);

        for(i=0; i < c; i++)
            q3.put((char) ('A' + i));
        // ShowInputFromKeyboard the queue.
        System.out.print("3. Contents of circular queue: ");
        for(i=0; i < c; i++)
            System.out.print(q3.get());
        System.out.println("\n");

        /**4*/
        // Put more characters into circular queue.
        for(i=d; i < c + d; i++)
            q3.put((char) ('A' + i));
        // ShowInputFromKeyboard the queue.
        System.out.print("4. Contents of circular queue +10: ");
        for(i=0; i < c ; i++)
            System.out.print(q3.get());

        /**5*/
        System.out.println("\n\n5. Store and consume from" +
                " circular queue.");
        // Use and consume from circular queue.
        for(i=0; i < c + d; i++){
            q3.put((char) ('A' + i));
            System.out.print(q3.get());
        }
    }
}
