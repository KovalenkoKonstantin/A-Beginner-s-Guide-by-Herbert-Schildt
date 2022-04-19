package beginners_guide_schildt.chapter6_Static.listing3;

// Усовершенствованный класс очереди, предназначенной для хранения символьных значений
class Queue {
    // Эти члены класса теперь являются закрытыми
    private char q []; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы для вставки и извлечения элементов очереди

    Queue(int size) { //конструктор
        q = new char[size]; // выделить память для очереди
        putloc = getloc = 0;
    }

    // Поместить символ в очередь
    void put(char ch) { //метод
        if(putloc==q.length) {
            System.out.println(" -- Очередь заполнена.");
            return;
        }

        q[putloc++] = ch;
    }

    // Извлечь символ из очереди.
    char get() { //метод
        if(getloc == putloc) {
            System.out.println(" -- Очередь пуста.");
            return (char) 0;
        }

        return q[getloc++];
    }
}
