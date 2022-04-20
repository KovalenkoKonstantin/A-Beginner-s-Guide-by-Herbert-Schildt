package chapter9_Exceptions.listing19;

import chapter9_Exceptions.listing16.*;
import chapter9_Exceptions.listing17.*;
import chapter9_Exceptions.listing18.*;
// Demonstrate the queue exceptions.
class QExcDemo {
    public static void main(String args[]) {
        int i, size = 5;
        char ch;

        FixedQueue q = new FixedQueue(size);

        try {
            // overrun the queue /Переполнение очереди
            for(i=0; i < size + 1; i++) {
                System.out.print("Attempting to store : " +
                        (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" -- OK");//reach Mistake and stops performing the program
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            // over-empty the queue /Попытка извлечь символ из пустой очереди
            for(i=0; i < size + 1; i++) {
                System.out.print("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
