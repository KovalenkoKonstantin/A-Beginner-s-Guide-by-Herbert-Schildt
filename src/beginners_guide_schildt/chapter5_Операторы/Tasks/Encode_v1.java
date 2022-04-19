package beginners_guide_schildt.chapter5_Операторы.Tasks;

/* Использование поразрядной операции исключающего ИЛИ
для шифрования и дешифрования сообщений.
Над всеми символами сообщения будет выполняться поразрядная
операция исключающего ИЛИ. Сначала данная операция будет выполняться
при шифровании, формируя зашифрованный текст, а затем - при дешифровании,
которое восстановит исходный текст сообщения

Расширьте класс Encode таким образом, чтобы в качестве ключа шифрования использовалась
строка из восьми символов.*/
class Encode_v1 {
    public static void main(String args[]) {
        String msg = "Любой текст любой длины с любыми символами";
        String encmsg = "";
        String decmsg = "";
        String key = "абра кадабра";

        System.out.println("Задана строка: '" + key + "' состоящая из "+ key.length() + " символов" +
                "\nявляющаяся кодом и шифрующая исходный текст: ");
        System.out.println("'" + msg + "'");
        System.out.println();

        byte variable = (byte) key.length();//110 1111
        System.out.print("Заданная строка приводится к двоичному коду: \n'");
        for (int x = 128; x > 0; x = x / 2) { //128 - 1000 0000
            //128|64|32|16|8}4|2
            if ((variable & x) != 0) System.out.print("1");
            else System.out.print("0");
        }
        System.out.print("'");
        System.out.println();
        System.out.println();

        System.out.println("Двоичный код объединяется с исходным сообщением, шифруя его: ");
        // Зашифровать сообщение
        for (int i = 0; i < msg.length(); i++)
            encmsg += (char) (msg.charAt(i) ^ key.length());
        //char charAt (index) - Возвращает символ, занимающий в строке позицию,
        // указываемую параметром index
        //попозиционно перебирается исходное сообщение
        //объединяется с ключём шифрования

        //Создание зашифрованной строки
        System.out.print("Зашифрованное сообщение: '");
        System.out.println(encmsg + "'");
        System.out.println();

        System.out.println("Зашифрованное сообщение объединяется с ключом шифрования " +
                "\nдешифруя зашифрованное сообщение: ");
        // Дешифровать сообщение
        for (int i = 0; i < msg.length(); i++)
            decmsg += (char) (encmsg.charAt(i) ^ key.length());
        //Сазданне дешифрованной строки

        System.out.print("Дешифрованное сообщение: '");
        System.out.println(decmsg + "'");
    }
}