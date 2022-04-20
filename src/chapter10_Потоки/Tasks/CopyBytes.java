package chapter10_Потоки.Tasks;

import java.io.*;

/**
 * Напишите программу для копирования текстовых файлов.
 * Видоизмените ее таким образом, чтобы все пробелы заменялись дефисами.
 * Используйте при написании программы классы, представляющие байтовые потоки,
 * а также традиционный способ закрытия файла явным вызовом метода close ().
 */
public class CopyBytes {
    public static void main(String[] args) {
        int i, j;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        InputStreamReader ins = null;
        OutputStreamWriter osr = null;
        try {
            fin = new FileInputStream("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                    "/src/beginners_guide_schildt/chapter10/Tasks/another.txt");
            ins = new InputStreamReader(fin, "UTF-8");

            fout = new FileOutputStream("c:/Users/k.kovalenko/Downloads/II/HelloWorld" +
                    "/src/beginners_guide_schildt/chapter10/Tasks/1.txt", false);
            osr = new OutputStreamWriter(fout, "UTF-8");

            do {
                i = ins.read();
                System.out.print((char) i);
                if ((char) i == ' ') i = '-';
                if (i != -1) fout.write(i);
            } while (i != -1);

        } catch (IOException e) {
            System.out.println("An I/O Error Occurred" + e);
        } finally {
            try {
                if (fin != null) fin.close();
                if (fin != null) ins.close();
                if (fin != null) fout.close();
                if (fin != null) osr.close();
            } catch (IOException exc) {
                System.out.println("Error Closing File");
            }
        }
    }
}
