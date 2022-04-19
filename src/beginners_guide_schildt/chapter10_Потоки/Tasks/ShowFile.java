package beginners_guide_schildt.chapter10_Потоки.Tasks;

import java.io.*;

class ShowFile {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("c:/filename.txt");
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }
    }
}