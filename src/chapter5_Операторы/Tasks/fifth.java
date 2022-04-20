package chapter5_Операторы.Tasks;

/*Все строки являются объектами типа String. Покажите, как вызываются методы
        length () и charAt () для строкового литерала "Мне нравится Java ".*/

public class fifth {
    public static void main(String[] args) {
        String s = "Мне нравится Java";
        System.out.println(s);
        int a = 10;
        char result = s.charAt(a);
        //возвращает символ, расположенный по указанному индексу строки. Индексы строк в Java начинаются с нуля.
        System.out.println(result);
        System.out.println(s.length());//колличество символов
    }
}
