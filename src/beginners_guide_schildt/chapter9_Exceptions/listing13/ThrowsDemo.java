package beginners_guide_schildt.chapter9_Exceptions.listing13;

import java.io.*;

// Use throws.
class ThrowsDemo {
    public static char prompt(String str)
            throws IOException {

        System.out.print(str);
        return (char) System.in.read(); //public abstract int read() throws IOException;
    }

    public static void main(String args[]) {
        char ch;

        try {
            ch = prompt("Enter a letter: ");
        }
        catch(IOException exc) {
            System.out.println("I/O exception occurred.");
            ch = 'X';
        }

        System.out.println("You pressed " + ch);
    }
}