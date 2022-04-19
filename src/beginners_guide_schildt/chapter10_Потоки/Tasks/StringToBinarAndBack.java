package beginners_guide_schildt.chapter10_Потоки.Tasks;
/* Как преобразовать числовую строку "123. 23" в ее двоичный эквивалент?*/
import java.io.*;
class StringToBinarAndBack {
    public static void main(String args[])
    {
        double i, a = 123.23;
        //в потоке типа DatainputStream данные читаются в двоичном виде, а не в удобной для чтения форме
        try (DataOutputStream dataOut =
                     new DataOutputStream(new FileOutputStream("some_data"))
        ) {
            System.out.println("Writing " + a);
            dataOut.writeDouble(a);
        }
        catch(IOException exc) {
            System.out.println("Write error.");
        }
        System.out.println();
        // Now, read them back.
        try (DataInputStream dataIn =
                     new DataInputStream(new FileInputStream("some_data"))
        ) {
            i = dataIn.readDouble();
            System.out.println("Reading " + i);
        }
        catch(IOException exc) {
            System.out.println("Read error.");
        }
    }
}
