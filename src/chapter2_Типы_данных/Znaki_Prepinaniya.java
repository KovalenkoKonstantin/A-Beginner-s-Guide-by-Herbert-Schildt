package chapter2_Типы_данных;

// Демонстрация управляющих последовательностей в символьных строках /Demonstrate escape sequences in strings.
class Znaki_Prepinaniya {
    public static void main(String args[]) {
        System.out.println("First line\nSecond line");//\n  Перевод строки
        System.out.println("A\tB\tC");//\t  Горизонтальная табуляция
        System.out.println("D\tE\tF");
    }
}/*     \'  Одинарная кавычка
        \"  Двойная кавычка
        \\  Обратная косая черта
        \r  Возврат каретки
        \n  Перевод строки
        \f  Перевод страницы
        \t  Горизонтальная табуляция
        \Ь  Возврат но одну позицию
        \ddd    Восьмеричная константа (rде ddd -восьмеричное число)
        \ uхххх  Шестнадцатеричная константа (rде хххх -шестнадцатеричное
                число)

        ==  Равно
        !=  Не равно
        >   Больше
        <   Меньше
        >=  Больше или ровно
        <=  Меньше или ровно
        &   и
        |   или
        ^   Исключающее ИЛИ
        ||  Укороченное ИЛИ
        &&  Укороченное И
        !   НЕ
        >>  Сдвиг вправо
        >>> Сдвиг вправо без знака
        <<  Сдвиг влево
        ~   Дополнение до 1 (унарная операция НЕ)*/


