package beginners_guide_schildt.chapter10_Потоки.listing5;

/** Copy a text file.
   To use this program, specify the name
   of the source file and the destination file.
   For example, to copy a file called FIRST.TXT
   to a file called SECOND.TXT, use the following
   command line.
   java CopyFile FIRST.TXT SECOND.TXT
*/

import java.io.*;

class CopyFile {
    public static void main(String args[]) //throws IOException
    {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // First, make sure that both files has been specified.
        if(args.length != 2) {
            System.out.println("Attempt: CopyFile from fin to fout");
            //return;
        }

        // Copy a File.
        try {
            // Attempt to open the files.
            fin = new FileInputStream("c:/Users/k.kovalenko/Downloads/II/" +
                    "HelloWorld/src/beginners_guide_schildt/chapter10/listing5/example.txt");
            //создаёт новый файл по указанному пути
            //fout = new FileOutputStream("c:/1.txt");//нет доступа
            fout = new FileOutputStream("c:/Users/k.kovalenko/Downloads/" +
                    "II/HelloWorld/src/beginners_guide_schildt/chapter10/listing5/another.txt", true);

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if(fout != null) fout.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }System.out.println("Successfully written");
    }
}
