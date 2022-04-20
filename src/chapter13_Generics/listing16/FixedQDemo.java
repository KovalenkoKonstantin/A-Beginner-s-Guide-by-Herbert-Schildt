package chapter13_Generics.listing16;

import chapter13_Generics.listing13.QueueFullException;
import chapter13_Generics.listing14.QueueEmptyException;
import chapter13_Generics.listing15.GenFixedSizeQueue;

/*  Try This 13-1
    Demonstrate a generic queue class.*/
class FixedQDemo {
    public static void main(String args[]) {
        // Create in Integer queue.
        Integer iStore[] = new Integer[10];
        // Create a Double queue.
        Double dStore[] = new Double[4];

        Integer iVal;
        Double dVal;

        GenFixedSizeQueue<Integer> q = new GenFixedSizeQueue<>(iStore);
        GenFixedSizeQueue<Double> q2 = new GenFixedSizeQueue<>(dStore);

        System.out.println("Demonstrate a queue of Integers:");
        try {
            for (int i = 1; i < 6; i++) {
                if (i < 5)
                    System.out.println("Adding an integer " + i + " to the queue of Integers;");
                else System.out.println("Adding an integer " + i + " to the queue of Integers.");

                q.put(i); // add an integer value to q
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        System.out.println("Now get Integers from that queue:");
        try {
            for (int i = 1; i < 6; i++) {
                iVal = q.get();
                //System.out.println(iVal);
                if (i == 1) {
                    System.out.println("Getting first Integer from queue: " + iVal + ";");
                } else {
                    if (i > 1 && i < 5)
                        System.out.println("Getting next Integer from queue: " + iVal + ";");
                    else {
                        System.out.println("Getting next Integer from queue: " + iVal + ".");
                    }
                }
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        System.out.println("Demonstrate a queue of Doubles:");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + (double) i / 2 +
                        " to queue of Doubles.");
                q2.put((double) i / 2); // add double value to q2
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Getting next Double from queue of Doubles: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
