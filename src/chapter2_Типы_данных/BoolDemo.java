package chapter2_Типы_данных;

// Демонстрация использования логических значений /Demonstrate boolean values.
class BoolDemo {
    public static void main(String args[]) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        // Логическое значение можно использовать для
        // управления условным оператором if
        // a boolean value can control the if statement
        if(b) System.out.println("Эта инструкция выполняется /This is executed.");

        b = false;
        if(b) System.out.println("This is not executed.");

        // В результате выполнения сравнения
        // получается логическое значение
        // outcome of a relational operator is a boolean value
        System.out.println("10 < 9 is " + (10 < 9));/*Скобки в данном случае необходимы,
                потому что операция + имеет более высокий приоритет по сравнению с операцией >*/
        System.out.println("10 > 9 is " + (10 > 9));
    }
}
