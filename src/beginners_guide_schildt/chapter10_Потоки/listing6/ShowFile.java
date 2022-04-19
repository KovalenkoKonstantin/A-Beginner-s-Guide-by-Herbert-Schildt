package beginners_guide_schildt.chapter10_Потоки.listing6;

// This version of the ShowFile program uses a try-wth-resources
//statement to automatically close a file when it is no longer needed.
//Note: This code requires JDK 7 or later.

import java.io.*;

class ShowFile {
    public static void main(String args[])
    {
        int i;

        // First, make sure that a file name has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            //return;
        }

        // The following code uses try-with resources to open a file
        // and then automatically close it when the try block is left.
        try(FileInputStream fin = new FileInputStream("c:/Users/k.kovalenko/Downloads" +
                "/II/HelloWorld/src/beginners_guide_schildt/chapter10/listing5/newfile.txt"))
        {
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
