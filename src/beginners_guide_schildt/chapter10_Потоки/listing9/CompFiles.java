package beginners_guide_schildt.chapter10_Потоки.listing9;
/*Try This 10-1 Compare two files.
   To use this program, specify the names
   of the files to be compared on the command line.
   java CompFile FIRST.TXT SECOND.TXT
   This code requires JDK 7 or later.*/
import java.io.*;

class CompFiles {
    public static void main(String args[])
    {
        int i, j;

        try (
        FileInputStream source1 = new FileInputStream("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                "/src/beginners_guide_schildt/chapter10/listing5/example.txt");
        FileInputStream source2 = new FileInputStream("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                "/src/beginners_guide_schildt/chapter10/listing4/filename.txt");
        FileOutputStream file1 = new FileOutputStream("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                "/src/beginners_guide_schildt/chapter10/listing9/file1.txt", false);
        FileOutputStream file2 = new FileOutputStream("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                "/src/beginners_guide_schildt/chapter10/listing9/file2.txt", false)
        ) {
            do {
                i = source1.read();
                if (i != -1) file1.write(i);
                j = source2.read();
                if (j != -1) file2.write(j);
            } while (i != -1 & j != -1);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);}

            File file1 = new File("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                    "/src/beginners_guide_schildt/chapter10/listing9/file1.txt");
            File file2 = new File("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                    "/src/beginners_guide_schildt/chapter10/listing9/file2.txt");

        // First make sure that both files have been specified.
        if(args.length !=2 ) {
            System.out.println("Usage: Compare Files f1 and f2");
            //return;
        }
        // Compare the files.
        try ( FileInputStream f1 = new FileInputStream(file1);
              FileInputStream f2 = new FileInputStream(file2)
        )
        {
            // Check the contents of each file.
            do {
                i = f1.read();
                j = f2.read();
                if(i != j) break;
            } while(i != -1 && j != -1); //находит первое ложное значение

            if(i != j)
                System.out.println("Files are different.");
            else
                System.out.println("Files are the same.");
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
}

}
