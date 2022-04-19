package beginners_guide_schildt.chapter2_Типы_данных;

// Демонстрация области действия блока кода /Demonstrate block scope.
class ScopeDemo {
    public static void main(String args[]) {
        int x = 10; // Эта переменная доступна для всего кода в методе main /known to all code within main

        //x = 10;
        if(x == 10) { // Начало новой области действия /start new scope
            int y = 20; // В блоке условного оператора if объявляется переменная у.
            // Эта переменная доступна только в данном блоке /known only to this block
            //переменные, созданные в области их действия, удаляются,
            //как только управление в программе передается за пределы этой области
            //Таким образом, время жизни переменной ограничивается областью ее действия.

            // Обе переменные, "х" и "у", доступны в данном кодовом блоке /x and y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
            // y = 100; // Ошибка! В этом месте переменная "у" недоступна /Error! y not known here

            // А переменная "х" по-прежнему доступна /x is still known here.
        System.out.println("x is " + x);
    }
}
