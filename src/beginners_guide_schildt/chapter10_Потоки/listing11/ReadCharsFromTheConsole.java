package beginners_guide_schildt.chapter10_Потоки.listing11;

// Use a BufferedReader to read characters from the console.
import java.io.*;

class ReadCharsFromTheConsole {
    public static void main(String args[])
            throws IOException
    {
        char c;
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));
//Поток ввода System. in - это экземпляр класса InputStream, и поэтому его можно
//указать в качестве параметра inputStream данного конструктора.
        System.out.println("Press '.' + enter to quit.\nEnter any characters: ");

        // read characters
        do {
            c = (char) br.read();
            System.out.print(c);
        } while(c != '.');
    }
}
