package beginners_guide_schildt.chapter13_Generics.listing16;

import beginners_guide_schildt.chapter13_Generics.listing15.GenerateCircularQueue;

public class CircularQDemo {
    public static void main(String[] args) {

        int a = 10, b = 5, c = 10, d = 10, i;

        // Create in Integer queue.
        Integer iStore[] = new Integer[10];
        // Create in Char queue.
        Character cStore[] = new Character[5];
        // Create a Double queue.
        Double dStore[] = new Double[4];

        Integer iVal;
        Character cVal;
        Double dVal;

        GenerateCircularQueue<Integer> q = new GenerateCircularQueue<>(iStore);
        GenerateCircularQueue<Character> q1 = new GenerateCircularQueue<>(cStore);
        GenerateCircularQueue<Double> q2 = new GenerateCircularQueue<>(dStore);

        System.out.println("Demonstrate a queue of Integers:");


        /**3*/
        //создание объекта класса CircularQueue
        //CircularQueue q3 = new CircularQueue(c);

        for(i=0; i < c; i++)
            q1.put((char) ('A' + i));
        // ShowInputFromKeyboard the queue.
        System.out.print("3. Contents of circular queue: ");
        for(i=0; i < c; i++)
            System.out.print(q1.get());
        System.out.println("\n");

        /**4*/
        // Put more characters into circular queue.
        for(i=d; i < c + d; i++)
            q1.put((char) ('A' + i));
        // ShowInputFromKeyboard the queue.
        System.out.print("4. Contents of circular queue +10: ");
        for(i=0; i < c ; i++)
            System.out.print(q1.get());

        /**5*/
        System.out.println("\n\n5. Store and consume from" +
                " circular queue.");
        // Use and consume from circular queue.
        for(i=0; i < c + d; i++){
            q1.put((char) ('A' + i));
            System.out.print(q1.get());
        }
    }
}
