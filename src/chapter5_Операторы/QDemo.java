package chapter5_Операторы;

// Демонстрация использования класса Queue.
class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);//задаётся длина большой очереди
        Queue smallQ = new Queue(4);//задаётся длина маленькой очереди
        char ch;
        int i;

        System.out.println("Использование очереди ЬigQ для сохранения алфавита.");
//Поместить буквенные символы в очередь bigQ
        for(i=0; i < 26; i++)
//26-колличество букв в английском алфавите
            bigQ.put((char) ('A' + i));
//используется метод put
//приведение к типу char
//Извлечь буквенные символы из очереди bigQ и отобразить
        System.out.print("Содержимое очереди bigQ: ");
        for(i=0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок.");
// Использовать очередь smallQ для генерации ошибок
        for(i=0; i < 5; i++) {
            System.out.print("Попытка сохранения " +
                    (char) ('Z' - i));
//приведение к типу char
//Z-4 = V
//q = new char[4]
//q.length = 4
//значение переменной putloc соответствует последней позиции в массиве q
//putloc = 4
            smallQ.put((char) ('Z' - i));
//smallQ.put((char) ( V ));
            System.out.println();
        }
        System.out.println();
//Дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != (char) 0)
            System.out.print(ch);
        }
    }
}
