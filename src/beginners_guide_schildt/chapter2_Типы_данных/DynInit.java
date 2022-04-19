package beginners_guide_schildt.chapter2_Типы_данных;

// Демонстрация динамической инициализации /Demonstrate dynamic initialization.
class DynInit {
    public static void main(String args[]) {
        double radius = 4, height = 5;//double radius - объявление переменной;
        // radius = 4 - инициализация переменной
        //main - метод

        // Переменная volume инициализируется динамически /dynamically initializ volume
        double volume = 3.1416 * radius * radius * height;/*В выражении динамической
        инициализации можно использовать любой определенный к этому моменту элемент,
        в том числе вызовы методов, другие переменные и литералы.*/

        System.out.println("Объём /Volume is: " + volume);
/*      блок начинается с открывающей фигурной скобки и оканчивается закрывающей фигурной
        скобкой. Блок определяет область действия (видимости) переменных. Начиная
        новый блок, вы всякий раз создаете новую область действия. По существу, область действия
        определяет доступность объектов из других частей программы и время их жизни
        (срок их действия).
        Как правило, переменные, объявленные в некоторой области действия, невидимы
        (а следовательно, недоступны) за ее пределами. Таким образом, объявляя переменную в
        некоторой области действия, вы тем самым ограничиваете пределы ее действия и защищаете
        ее от нежелательного доступа и видоизменения. На самом деле правила определения
        области действия служат основанием для инкапсуляции.*/
    }
}
