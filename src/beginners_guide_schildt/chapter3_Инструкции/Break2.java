package beginners_guide_schildt.chapter3_Инструкции;

// Read input until a q is received.
// Чтение вводимых данных до тех пор, пока не будет получена буква q
class Break2 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, ignore;
        System.out.println("Ничего не происходит");

        for( ; ; ) {
            ch = (char) System.in.read(); // получить символ с клавиатуры
            System.out.printf("Для выхода нажмите символ 'q'");
            do {
                ignore = (char) System.in.read();
            } while (ignore !='\n');
            if(ch == 'q') break;
        }
        System.out.println("Bы нажали клавишу q!");
    }
}