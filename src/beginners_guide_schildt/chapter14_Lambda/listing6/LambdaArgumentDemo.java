package beginners_guide_schildt.chapter14_Lambda.listing6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LambdaArgumentDemo {

    // This method has a functional interface as the type of its
    // first parameter. Thus, it can be passed a reference to any
    // instance of that interface, including an instance created
    // by a lambda expression. The second parameter specifies the
    // string to operate on.
    /**Методу может быть передана ссылка на любой экземпляр интерфейса StringFunc,
     * в том числе и на экземпляр, созданный с помощью лямбда-выражения,
     * совместимого с интерфейсом StringFunc.
     * Возвращаемым значением является обработанная строка.*/
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[]) throws IOException {
        //String inStr = "Lambda Expressions Expand Java"; //initialized
        //Define/enter input String
        System.out.println("Enter input string:");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String inStr = in.readLine();
        System.out.println("Here is input string: " + inStr);

        // Define a lambda expression that reverses the contents
        // of a string and assign it to a StringFunc reference variable.
        /**еще один пример блочного лямбда-выражения*/
        StringFunc reverse = (str) ->  {
            String result = null;
//начиная с последней позиции, уменьшать до тех пор пока не придёт в начало
            for(int i = str.length()-1; i >= 0; i--)
//перечислить все символы начиная с последней позиции
                result += str.charAt(i);
            return result; //просто вывести на печать не получится
        };
        System.out.println("В случае обращания напрямую к лямбде revers - " +
                "будет выведена ссылка: \n" + reverse);

        // Pass reverse to the first argument to static method changeStr().
        // Pass the input string as the second argument.
        /**статическому методу changeStr передана ссылка на экземпляр интерфейса StringFunc,
         *созданный с помощью лямбда-выражения
         *Возвращаемым значением является обработанная строка.
         * Мы можем передать лямбду reverse методу changeStr (), поскольку его первый
         * параметр имеет тип StringFunc.*/
        String outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);
        System.out.println("Или тоже самое но без создания статического метода: " + reverse.func(inStr));


        // This lambda expression replaces spaces with hyphens.
        // It is embedded/внедряется directly in the call to changeStr().
        //replace is the method from the String class
        /**Используемая здесь версия этого метода принимает
         в качестве аргументов заменяемый и подставляемый символы и возвращает измененную
         строку.*/
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("The string with spaces replaced: " + outStr);

        // This block lambda inverts the case/регистр of the characters in the
        // string. It is also embedded directly in the call to changeStr().
        outStr = changeStr((str) -> {
            String result = "";
            char ch;

            for(int i = 0; i < str.length(); i++ ) {
                ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    result += Character.toLowerCase(ch);
                else
                    result += Character.toUpperCase(ch);
            }
            return result;
        }, inStr);
        System.out.println("The string in reversed case: " + outStr);
    }
}
