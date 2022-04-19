package beginners_guide_schildt.chapter3_Инструкции;

//A simple help system.
//Синтаксис операторов if, switch, for, while, break
public class HelpConfig {
   public void helpon (int i){
        switch (i) {
            case '0':
                System.out.println("Если число итераций известно заранее, то лучше выбрать цикл for.\n" +
                        "Цикл while оказывается наиболее удобным тогда, когда число повторений цикла заранее\n" +
                        "неизвестно. В тех случаях, когда требуется, чтобы была выполнена хотя бы одна итерация,\n" +
                        "используйте цикл do-while.:\n");
                break;
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Оператор switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("  case константа1:");
                System.out.println("    последовательность операторов");
                System.out.println("    break;");
                System.out.println("  case константа2:");
                System.out.println("    последовательность операторов");
                System.out.println("    break;");
                System.out.println("  // ...");
                System.out.println(" default:\nпоследовательность операторов");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Цикл for:\n");
                System.out.print("for(инициализация; условие; итерация) \n{");
                //Здесь инициализация, как правило, представлена оператором присваивания, задающим
                //первоначальное значение переменной, которая играет роль счетчика и управляет циклом
                //условие - это логическое выражение, определяющее необходимость повторения цикла
                //итерация - выражение, определяющее величину, на которую должно изменяться
                //значение переменной, управляющей циклом, на каждом шаге цикла
                System.out.println("  последовательность операторов;");
                System.out.println("}");
                //Выполнение цикла for будет продолжаться до тех пор, пока проверка условия
                //дает истинный результат. Как только эта проверка даст ложный результат, цикл завершится,
                //а выполнение программы будет продолжено с оператора, следующего после цикла for.
                break;
            case '4':
                System.out.println("Цикл while:\n");
                System.out.println("while(условие) оператор;");
                //В этом цикле оператор выполняется до тех пор, пока условие истинно. Как только
                //условие становится ложным, управление программой передается строке кода, следующей
                //непосредственно после цикла.
                break;
            case '5':
                System.out.print("Цикл do-while:\n");
                System.out.println("do {\n\t{операторы;\n} while (условие);");
                //В этом цикле оператор выполняется до тех пор, пока условие истинно. Как только
                //условие становится ложным, управление программой передается строке кода, следующей
                //непосредственно после цикла.
                break;
            case '6':
                System.out.println("Оператор break:");
                System.out.println("break; или break метка;");
                //метка - это имя, обозначающее блок кода.При выполнении расширенного
                //оператора break управление передается за пределы именованного блока.
                //Роль метки может выполнять любой допустимый в Java идентификатор с двоеточием.
                //Пометив блок кода, метку можно использовать в качестве адресата оператора
                //break. Благодаря этому выполнение программы возобновляется с конца именованного
                //блока.
                // В операторе break нельзя использовать метку, не
                //определенную в охватывающем ero цикле.
                break;
            case '7':
                System.out.println("Оператор сontinue:");
                System.out.println("continue; или continue метка;");
                //метка - это имя, обозначающее блок кода.При выполнении расширенного
                //оператора break управление передается за пределы именованного блока.
                //Роль метки может выполнять любой допустимый в Java идентификатор с двоеточием.
                //Пометив блок кода, метку можно использовать в качестве адресата оператора
                //break. Благодаря этому выполнение программы возобновляется с конца именованного
                //блока.
                // В операторе break нельзя использовать метку, не
                //определенную в охватывающем ero цикле.
                break;
            case '8':
                System.out.println("Оператор new:");
                System.out.println("переменная_класса = new имя_класса(список_аргументов);");
                //где переменная_ класса обозначает тип переменной создаваемого класса, а имя_ класса
                //- конкретное имя класса, реализуемого в виде экземпляра его объекта. Имя класса и
                //список_ аргументов в скобках, который может быть пустым, обозначают конструктор
                //этого класса. Если в классе не определен его собственный конструктор, то в операторе new
                //будет использован конструктор, предоставляемый в Java по умолчанию..
                break;
            case '9':
                System.out.println("Метод finalize:");
                System.out.println("protected void finalize()\n" +
                        "{\n" +
                        "// здесь указывается код метода завершения\n" + "}");
                break;
            case 10:
                System.out.println("Массив:");
                System.out.println("имя_массива [] = new тип[размер];");
                break;
            case 11:
                System.out.println("Цикл for-each:");
                System.out.println("fоr(тип_итерационной_переменной : коллекция) блок_операторов");
                break;
            case 12:
                System.out.println("Метода substring:");
                System.out.println("string substring(int начальный_индекс, int конечный_индекс)");
                break;
            case 13:
                System.out.println("Тернарный оператор ?:");
                System.out.println("выражение_1 ? выражение_2 : выражение_З;\n");
                break;
        }
        System.out.println();
    }

    public void showMenu () {
        System.out.println("Для получения синтаксиса выбери нужный:");
        System.out.println("  0. Что лучше выбрать for, while или do-while?");
        System.out.println("  1. оператор if else");
        System.out.println("  2. оператор switch");
        System.out.println("  3. цикл for");
        System.out.println("  4. цикл while");
        System.out.println("  5. цикл do-wile");
        System.out.println("  6. оператор break (аналог goto)");
        System.out.println("  7. оператор continue");
        System.out.println("  8. оператор new");
        System.out.println("  9. метод finalize");
        System.out.println("  10. массив");
        System.out.println("  11. цикл for-each");
        System.out.println("  12. метода substring()");
        System.out.println("  13. тернарный оператор ?\n");
        System.out.print("Выбор '0-10' (q - выход): ");
    }
    public boolean isValid (int ch){
        if (ch < 0 | ch > 1_000 & ch != 'q') return false;
                else return true;
    }
}
