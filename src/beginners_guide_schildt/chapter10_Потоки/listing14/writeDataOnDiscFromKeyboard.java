package beginners_guide_schildt.chapter10_Потоки.listing14;

// A simple key-to-disk utility that demonstrates a FileWriter.

// This code requires JDK 7 or later.

import java.io.*;
public class writeDataOnDiscFromKeyboard {
    public static void main(String args[])
    {

        String str;
        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));

        System.out.println("Enter text ('stop' to quit).");
/**автоматически создаёт файл*/
        try (FileWriter fw = new FileWriter("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                "/src/beginners_guide_schildt/chapter10/listing14/example.txt", false))
        {
            do {
                System.out.print(": ");
                str = br.readLine();

                if(str.compareTo("stop") == 0) break;

                str = str + "\r\n"; // add newline
                fw.write(str);
            } while(str.compareTo("stop") != 0);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
