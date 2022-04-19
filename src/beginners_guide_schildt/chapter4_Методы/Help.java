package beginners_guide_schildt.chapter4_Методы;

import beginners_guide_schildt.chapter3_Инструкции.HelpConfig;

public class Help {
    public static void main(String[] args)
    throws java.io.IOException {
            char ignore;
            int choice;
            //Оператор throws java. io. IOException требуется
            //для обработки ошибок, которые могут возникнуть в процессе ввода данных.
            HelpConfig hlpobj = new HelpConfig();
            for (;;){
                do {
                    hlpobj.showMenu();
                    choice = (char) System.in.read();
                    // Метод System.in.read() возвращает символ с клавиатуры
                    // Возвращаемый символ представлен целочисленным значением,
                    // и поэтому, прежде чем присвоить его символьной переменной,
                    // следует выполнить явное его приведение к типу char

                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                }while (!hlpobj.isValid(choice));
                System.out.println();
                if (choice == 'q') break;
                hlpobj.helpon(choice);
            }
    }
}

