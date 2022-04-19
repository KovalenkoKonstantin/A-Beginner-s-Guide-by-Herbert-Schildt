package beginners_guide_schildt.chapter2_Типы_данных;

// Demonstrate the short-circuit operators.
//Демонстрация использования укороченных логических операций
class SCops {
    public static void main(String args[]) {
        int n = 10, d = 2, q;//нафига q не понятно, ведь оно не учитывается

        if(d != 0 && (n % d) == 0)
            System.out.println(d + " \nявляется делителем:\nis a factor of: \n" + n +"\nа остаток от деления такого выражения " +
                    "составит:\n"+ n%d +"\nрезультат же деления выражения составит:\n"+ n/d);
        //(n%d) остаток от деления 10/2=5 и 10%2=0, потому 0=0 - true
        //2!=0 - true
        //(true && true = true)

        d = 0;
        // now, set d to zero
        // установить для d нулевое значение

        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
        //Укороченная операция предотвращает деленне на нуль
        //(false && деление на нуль) - второй операнд не вычисляется
        //для && условие false выполняется только в случае первого значения false

        if (d==0 || (n%d) ==0)
            System.out.println(d + " is not a factor of " + n);
        //Укороченная операция предотвращает деленне на нуль
        //(true || деление на нуль) - второй операнд не вычисляется
        // для || условие true выполняется только в случае первого значения true

    /* Now, try same thing without short-circuit operator.
       This will cause a divide-by-zero error.
       А теперь те же самые действия выполняются без использования
       укороченного логического оператора. В результате возникнет
       ошибка "деление на нуль".
    */
//        if(d != 0 & (n % d) == 0)
//            System.out.println(d + " is a factor of " + n);
        //Теперь вычисляются о6а выражения, в результате
        //чего будет производиться деление на нуль
    }
}
