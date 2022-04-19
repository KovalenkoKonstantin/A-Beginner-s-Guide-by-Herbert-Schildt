package beginners_guide_schildt.chapter10_Потоки.Tasks;
import java.io.*;
public class ReadSymbolsFromFile {
    public static void main(String[] args) {
        int i;
        try(
                //take file
        FileReader fr = new FileReader("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                "/src/beginners_guide_schildt/chapter10/listing5/example.txt");
        //create and write information from the file 1 into the file 2
        FileWriter frw = new FileWriter("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                "/src/beginners_guide_schildt/chapter10/Tasks" +
                "/another.txt", false)
        ){  //show in console written information
            do {
                i = fr.read();
                if (i != -1) frw.write(i);
                System.out.print((char) i);
            } while (i != -1);

        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
