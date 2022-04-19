package beginners_guide_schildt.chapter3_Инструкции.Tasks;

//Код ASCII символов нижнего регистра отличается от кода соответствующих символов
//верхнего регистра на величину 32. Следовательно, для преобразования
//строчной буквы в прописную нужно уменьшить ее код на 32. Используйте это обстоятельство
//для написания программы, осуществляющей получение символов с
//клавиатуры. При выводе результатов данная программа должна преобразовывать
//строчные буквы в прописные, а прописные - в строчные. Остальные символы не
//должны изменяться. Работа программы должна завершаться после того, как пользователь
//введет с клавиатуры точку. И наконец, сделайте так, чтобы программа
//отображала число символов, для которых был изменен регистр.
public class CaseChg {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, ignore;
        int x = 0;

        do {
            System.out.print("Введите латинскую букву: ");
            ch = (char) System.in.read();
            System.out.println("Вы ввели: " + ch);
            if (ch == '.') break;
            if (ch >= 'a' & ch <= 'z'){
                ch -=32;
                System.out.println("Буква верхнего регистра будет выглядеть так: " + ch + "\n");
                x++;
            }else if (ch >= 'A' & ch <= 'Z'){
                ch +=32;
                System.out.println("Буква нижнего регистра будет выглядеть так: " + ch + "\n");
                x++;
            }else System.out.println("Выбран неправильный символ\n");
            System.out.println("Для выхода нажми '.':\n");
            do {
                ignore = (char) System.in.read();
                } while (ignore !='\n');
            } while(ch != '.');
        System.out.println("Общее число символов для которых был изменён регистр составляет " + x);
        System.out.println("Ура!");
    }
}
