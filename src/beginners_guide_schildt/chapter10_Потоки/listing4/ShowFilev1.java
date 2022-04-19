package beginners_guide_schildt.chapter10_Потоки.listing4;

/** This variation wraps the code that opens and
   accesses the file within a single try block.
   The file is closed by the finally block.
*/
import java.io.*;
class ShowFilev1 {
    public static void main(String args[])
    {
        int i;
        FileInputStream fin = null; //fin инициализируется значением null

        // First, confirm that a file name has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            //return;
        }

        // The following code opens a file, reads characters until EOF
        // is encountered, and then closes the file via a finally block.
        try {
            fin = new FileInputStream("c:/Users/k.kovalenko/Downloads/" +
                    "II/HelloWorld/src/beginners_guide_schildt/chapter10/listing4/filename.txt");

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);

        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found.");
        } catch(IOException exc) {
            System.out.println("An I/O Error Occurred");
        } finally {
            // Close file in all cases.
            try {
                if(fin != null) fin.close(); //файл закрывается только в том случае, если значение переменной fin
                //не равно null
                //если во время открытия файла возникнет исключение, метод close () не будет вызываться
            } catch(IOException exc) {
                System.out.println("Error Closing File");
            }
        }
    }
}
