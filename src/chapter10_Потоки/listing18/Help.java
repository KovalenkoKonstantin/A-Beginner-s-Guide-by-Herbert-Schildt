package chapter10_Потоки.listing18;

//   Try This 10-2
//   A help program that uses a disk file
//   to store help information.
//   This code requires JDK 7 or later.

import java.io.*;

// The Help class opens a help file,
//   searches for an topic, and then displays
//   the information associated with that topic.
//   Notice that it handles all I/O exceptions
//   itself, avoiding the need for calling
//   code to do so.
class Help {
    String helpfile; // name of help file

    //конструктор
/**Имя файла со справочной информацией передается конструктору класса Help и
 запоминается в переменной экземпляра helpfile. А поскольку каждый экземпляр
 класса Help содержит отдельную копию переменной helpfile, то каждый
 из них может взаимодействовать с отдельным файлом. Это дает возможность создавать
 отельные наборы справочных файлов на разные темы.*/
    Help(String fname) {
        helpfile = fname;
    }
/**Этот метод извлекает справочную информацию по заданной теме*/
    // Display help on a topic. Принимает параметр what заданный пользователем.
    boolean helpOn(String what) {
        int ch;
        String topic, info;
        // Open the help file.
/**Для открытия файла со справочной информацией служит класс FileReader, оболочкой
 которого является класс BufferedReader. В справочном файле содержится
 текст, и поэтому справочную систему удобнее локализовать через символьные
 потоки ввода-вывода.*/
        try (BufferedReader helpRdr =
                     new BufferedReader(new FileReader(helpfile)))
        {
            // read characters until a # is found
            do {
/**Читать строки из файла пока не найдётся символ*/
                ch = helpRdr.read();
                // now, see if topics match
/**Если попадается символ #*/
                if(ch == '#') {
                    topic = helpRdr.readLine();
/**В том случае, если введённая с клавиатуры строка совпадает со следующей за найденой строкой
 начинающейся с специального символа #*/
                    if(what.compareTo(topic) == 0) { // found topic
                        do {
/**Прочитать строку и присвоить строке info ссылку на неё*/
                            info = helpRdr.readLine();
/**Вывести на экран строку если не пустая*/
                            if(info != null) System.out.println(info);
/**Выполнять до тех пор пока не будет найдена пустая строка*/
                        } while((info != null) && // находит первое ложное значение
                                (info.compareTo("") != 0));
/**Возвращает значение true для Topic not Found Exception
 * в том случае, если был введён неправильный символ с клавиатуры*/
                        return true;
                    }
                }
/**Выполнять до тех пор пока не будет найдена пустая строка*/
            } while(ch != -1);
        }
/**в методе helpon () обрабатываются
 все исключения, связанные с вводом-выводом, поэтому в заголовке метода не
 указано ключевое слово throws. Благодаря такому подходу упрощается разработка
 методов, в которых используется метод helpon (). В вызывающем методе достаточно
 обратиться к методу helpon (), не заключая его вызов в блок try / catch.*/
        catch(IOException exc) {
            System.out.println("Error accessing help file.");
            //return false;
        }
        return false; // topic not found
    }

    // Get a Help topic.
/**метод getSelection () предлагает указать
 тему и возвращает строку, введенную пользователем*/
    String getSelection() {
        String topic = "";
/**Прочитать информацию введённую с клавиатуры*/
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter topic: ");
        try {
            topic = br.readLine();
        }
        catch(IOException exc) {
            System.out.println("Error reading console.");
        }
        return topic;
    }
}