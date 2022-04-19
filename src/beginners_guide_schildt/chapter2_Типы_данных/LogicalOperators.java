package beginners_guide_schildt.chapter2_Типы_данных;

// Demonstrate the relational and logical operators.
//Демонстрация использования операций сравнения и логических операций
class LogicalOperators {
    public static void main(String args[]) {
        int i = 10, j = 11;
        boolean b1 = true, b2 = false;
//        i = 10;
//        j = 11;
        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("this won't execute");
        if(i >= j) System.out.println("this won't execute");
        if(i > j) System.out.println("this won't execute");
//        b1 = true;
//        b2 = false;
        if(b1 & b2) System.out.println("this won't execute");
        if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if(b1 | b2) System.out.println("b1 | b2 is true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 is true");
    }
}/*       P       q       p&q     p|q     p^q     !p
        false   false   false   false   false   true
        true    false   false   true    true    false
        false   true    false   true    true    true
        true    true    true    true    false   false*/
//    Если первый операнд логической операции "И" имеет
//    значение (false), то результат будет иметь ложное значение
//    независимо от значения второго операнда.
//    Если же первый операнд логической операции "ИЛИ" имеет истинное значение (true),
//    то ее результат будет иметь истинное значение независимо от значения второго
//    операнда.
//    Благодаря тому что значение второго операнда в этих операциях
//    вычислять не нужно, экономится время и повышается эффективность кода.

 /*Поразрядные операции И, ИЛИ, исключающее ИЛИ и НЕ
        P       q       p&q     p|q     p^q     !p
        0       0       0       0       0       1
        1       0       0       1       1       0
        0       1       0       1       1       1
        1       1       1       1       0       0*/