package beginners_guide_schildt.chapter10_Потоки.listing7;

//A version of CopyFile that uses try-with-resources.
//   It demonstrates two resources (in this case files) being
//   managed by a single try statement.
//   Note: This code requires JDK 7 or later.

import java.io.*;

class CopyFile {
    public static void main(String args[]) //throws IOException
    {
        int i;

        // First, confirm that both files has been specified.
        if (args.length != 1) {
            System.out.println("CopyFile from fin to fout");
            //return;
        }
        // Open and manage two files via the try statement.
        try (
                FileInputStream fin =
                        new FileInputStream("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                                "/src/beginners_guide_schildt/chapter10/listing5/example.txt");
                InputStreamReader ins =
                        new InputStreamReader(fin, "UTF-8");
                FileOutputStream fout =
                        new FileOutputStream("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                                "/src/beginners_guide_schildt/chapter10/listing7" +
                                "/another.txt", false);
                OutputStreamWriter osr =
                        new OutputStreamWriter(fout, "UTF-8")
        ) {
            do {
                i = ins.read();
                if (i != -1) osr.write(i);
                System.out.print((char) i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
