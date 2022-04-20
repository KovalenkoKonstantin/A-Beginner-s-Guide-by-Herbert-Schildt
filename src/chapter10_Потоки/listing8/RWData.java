package chapter10_Потоки.listing8;

/* Write and then read back binary data.
   This code requires JDK 7 or later.*/

import java.io.*;

class RWData {
    public static void main(String args[])
    {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        //create file
        File file = new File("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                "/src/beginners_guide_schildt/chapter10/listing8/some.txt");

        // Write some values.
        //в потоке типа DatainputStream данные читаются в двоичном виде, а не в удобной для чтения форме
        //в файле some.txt абракадабра
        try (DataOutputStream dataOut =
                     new DataOutputStream(new FileOutputStream(file))
        )
        {
            System.out.println("Writing " + i);
            dataOut.writeInt(i);

            System.out.println("Writing " + d);
            dataOut.writeDouble(d);

            System.out.println("Writing " + b);
            dataOut.writeBoolean(b);

            System.out.println("Writing " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        }
        catch(IOException exc) {
            System.out.println("Write error.");
            //return;
        }

        System.out.println();

        // Now, read them back.
        try (DataInputStream dataIn =
                     new DataInputStream(new FileInputStream(file))
        )
        {
            i = dataIn.readInt();
            System.out.println("Reading " + i);

            d = dataIn.readDouble();
            System.out.println("Reading " + d);

            b = dataIn.readBoolean();
            System.out.println("Reading " + b);

            d = dataIn.readDouble();
            System.out.println("Reading " + d);
        }
        catch(IOException exc) {
            System.out.println("Read error.");
        }
    }
}
