package chapter10_Потоки.listing15;

// A simple disk-to-screen utilitiy that demonstrates a FileReader.
// This code requires JDK 7 or later.

import java.io.*;

class DataToScreenFromFile {
    public static void main(String args[]) {
        String s;

        // Create and use a FileReader wrapped in a BufferedReader.
        try (BufferedReader br = new BufferedReader(new FileReader("c:/Users/k.kovalenko/" +
                "Downloads/II/HelloWorld" +
                "/src/beginners_guide_schildt/chapter10/listing14/example.txt")))
        {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
