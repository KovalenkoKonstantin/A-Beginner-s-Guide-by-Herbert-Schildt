package chapter10_Потоки.listing13;
//Если вы используете поток PrintWriter, программу будет проще интернационализировать.
import java.io.*;

public class PrintWriterDemo {
    public static void main(String args[]) {
/**создание объекта типа PrintWriter связанного с потоком типа System.out*/
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 10;
        double d = 123.65;

        pw.println("Using a PrintWriter.");
        pw.println(i);
        pw.println(d);

        pw.println(i + " + " + d + " = " + (i+d));
    }
}
