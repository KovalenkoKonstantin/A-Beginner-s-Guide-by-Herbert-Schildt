package chapter5_Операторы;

// Некоторые операции над строками.
class StrOps {
    public static void main(String args[]) {
        String str1 =
                "When it comes to Web programming, Java is #1.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful.";
        int result, idx;
        //char ch;

        System.out.println("Длина str1: " +
                str1.length());//Возвращает длину строки

        // Отобразить строку str1 посимвольно.
        for(int i=0; i < str1.length(); i++) //length () Возвращает длину строки
            System.out.print(str1.charAt(i)); //charAt (index) Возвращает символ, занимающий в строке позицию, укозываемую параметром index
        System.out.println();

        if(str1.equals(str2))
            System.out.println("str1 равна str2");
        else
            System.out.println("str1 не равна str2");

        if(str1.equals(str3))
            System.out.println("str1 равна str3");
        else
            System.out.println("str1 не равна str3");

        result = str1.compareTo(str3);
/*        Возвращает отрицательное значение, если текущая строка
        меньше строки str3; нуль, если эти строки ровны, и положительное
        значение, если текущая строка больше строки str3*/
        if(result == 0)
            System.out.println("str1 и str3 равны");
        else if(result < 0)
            System.out.println("str1 меньше str3");
        else
            System.out.println("str1 больше str3");


        // Присвоить переменной str2 новую строку
        str2 = "One Two Three One";

        idx = str2.indexOf("Three");
/*        Выполняет в текущей строке поиск подстроки, определяемой
        параметром str2. Возвращает индекс первого вхождения
        подстроки str2 или -1, если поиск завершается неудачно*/
        System.out.println("Индекс первого вхождения One: " + idx);
        idx = str2.lastIndexOf("One");
/*        Производит в текущей строке поиск подстроки, определяемой
        параметром str2. Возвращает индекс последнего
        вхождения подстроки str2 или -1, если поиск завершается
        неудачно*/
        System.out.println("Индекс последнего вхождения One: " + idx);

    }
}
