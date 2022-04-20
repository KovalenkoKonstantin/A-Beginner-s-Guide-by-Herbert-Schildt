package chapter2_Типы_данных;

// Side-effects can be important.
// Демонстрация роли побочных эффектов
class SideEffects {public static void main(String[] args){
        int i = 0;

    /* Here, i is still incremented even though
       the if statement fails.
       Значение переменной i инкрементируется, несмотря
       на то, что проверяемое условие в операторе if ложно*/
        if(false & (++i < 100))
            System.out.println("this won't be displayed");//не выполняется //(false & сё что угодно) = false
        System.out.println("Осуществляется вторая операция в операторе if\nif statements executed \n" +
                "в результате i инкрементируется: \n" + i +"\n");
        //но инкрементирование в теле условного оператора всё же выполняется и увеличивает i на 1
        // displays 1 // отображается 1

    /* In this case, i is not incremented because
       the short-circuit operator skips the increment.
       В данном случае значение переменной i не инкрементируется,
       поскольку второй операнд укороченного логического оператора
       не вычисляется, а следовательно, инкремент пропускается*/
        if(false && (++i < 100))
            System.out.println("this won't be displayed");//не выполняется //(false && всё что угодно) = false
        System.out.println("Вторая операция в условном операторе if не выполняется/игнорируется \nт.к. (&& - первый false):" +
                "\nif statements is not executed: \n" +
                "и в результате применятеся значение перменной i из предшествующего блока\n" + i);
        //используется значение i из предыдущего оператора
        // still 1 !!
        // по-прежнему отображается 1
    }
}
