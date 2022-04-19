package beginners_guide_schildt.chapter10_Потоки.Tasks;

import java.io.*;

/**
 * Перепишите программу, созданную в предыдущем пункте, таким образом, чтобы
 * в ней использовались классы, представляющие символьные потоки. На этот раз
 * воспользуйтесь оператором try с ресурсами для автоматического закрытия файла.
 */
public class CopyBytesv2 {
    public static void main(String[] args) {
        int i;

        try (FileReader fr = new FileReader("c:/Users/k.kovalenko/" +
                "Downloads/II/HelloWorld/src/beginners_guide_schildt/chapter10/Tasks/another.txt");
             FileWriter fw = new FileWriter("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                     "/src/beginners_guide_schildt/chapter10/Tasks/2.txt", false))
        {
            do {
                i = fr.read();
                if((char)i == ' ') i = '-';
                if(i != -1) fw.write(i);
                System.out.println(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred" + e);
        }
    }
}
