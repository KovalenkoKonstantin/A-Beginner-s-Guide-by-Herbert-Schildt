package beginners_guide_schildt.chapter10_Потоки.listing10;
// Demonstrate random access files.
// This code requires JDK 7 or later.
import java.io.*;

class RandomAccessDemo {
    public static void main(String args[]) throws IOException {
        double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        double d;
        int a = 8;//байт
        /**Поскольку для хранения значения типа double требуется 8 байтов, каждое последующее
         значение начинается на 8-байтовой границе предьшущего значения. Иными
         словами, первое числовое значение начинается с нулевого байта, второе - с 8-гo байта,
         третье - с 16-гo байта и т.д. Поэтому для чтения четвертого значения указатель файла
         должен быть установлен при вызове метода seek () на позиции 24-ro байта*/

        // Open and use a random access file.
        //public class RandomAccessFile implements DataOutput, DataInput, Closeable
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw"))
        {
            // Write values to the file "random.dat".
            for(int i=0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            // Now, read back specific values
            //seek is method of the RandomAccessFile public class
            raf.seek(a*0); // seek to first position
            d = raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(a*1); // seek to second double
            d = raf.readDouble();
            System.out.println("Second value is " + d);

            raf.seek(a * 3); // seek to fourth double
            d = raf.readDouble();
            System.out.println("Fourth value is " + d);

            System.out.println();

            // Now, read every other value.
            System.out.println("Here is every other value: ");
            for(int i=0; i < data.length; i+=2) {
                raf.seek(a * i); // seek to ith double
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }
        catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
