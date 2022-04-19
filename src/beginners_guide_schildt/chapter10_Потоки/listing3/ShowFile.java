package beginners_guide_schildt.chapter10_Потоки.listing3;

/** Display a text file.

   To use this program, specify the name
   of the file that you want to see.
   For example, to see a file called TEST.TXT,
   use the following command line.

   java ShowFile TEST.TXT
*/

import java.io.*;

class ShowFile {
    public static void main(String args[])
    {
        int i;
        FileInputStream fin;

        // First make sure that a file has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile File");
            //return;
        }

        try {
            fin = new FileInputStream("c:/Users/k.kovalenko/Downloads/II/HelloWorld/src" +
                    "/beginners_guide_schildt/chapter10_Потоки/listing3/filename.txt");
        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }

        try {
            // read bytes until EOF is encountered /Читать байты, пока не встретится символ EOF
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("Error reading file.");
        }

        try {
            fin.close();
        } catch(IOException exc) {
            System.out.println("Error closing file.");
        }

    }
}