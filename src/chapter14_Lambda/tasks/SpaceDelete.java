package chapter14_Lambda.tasks;

import chapter14_Lambda.listing6.StringFunc;

/**
 * Используя программу, созданную в упражнении 14.1, создайте лямбда-выражение,
 * которое удаляет все пробелы из заданной строки и возвращает результат.
 * Продемонстрируйте работу этого метода, передав его методу changeStr () .
 */
class SpaceDelete {
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String args[]) {
        String inStr = "Lambda Expressions Expand Java";
        System.out.println("Here is input string: " + inStr);

        StringFunc remove = (str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            return result;
        };
        String outStr = changeStr(remove, inStr);
        System.out.println("Initial string with replaced spaces: " + outStr);
    }
}
