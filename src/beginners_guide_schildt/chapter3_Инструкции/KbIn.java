package beginners_guide_schildt.chapter3_Инструкции;

// Read a character from the keyboard.
// Чтение символа с клавиатуры
class KbIn {
    public static void main(String args[])
            throws java.io.IOException {

        char ch;
        //оператор throws java. io. IOException
        //Этот оператор требуется
        //для обработки ошибок, которые могут возникнуть в процессе ввода данных.
        //Он является частью механизма обработки исключений в Java.

        System.out.print("Нажмите любую клавишу, а затем\n" +
                "клавишу ENTER: /Press any key followed by ENTER: ");

        ch = (char) System.in.read();
        //В рассматриваемой здесь программе применяется метод System. in. read ()
        // get a char получить символ Ввод символа с клавиатуры

        System.out.println("Вы нажали клавишу Your key is: " + ch);
    }
}
