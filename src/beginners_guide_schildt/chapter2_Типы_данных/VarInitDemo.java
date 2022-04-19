package beginners_guide_schildt.chapter2_Типы_данных;

// Демонстрация времени жизни переменной
// Demonstrate lifetime of a variable.
class VarInitDemo {
    public static void main(String args[]) {
        int x;

        for(x = 0; x < 3; x++) {
            int y = -1;
            // переменная у инициализируется при каждом входе в блок
            //у инициализируется значением -1
            // y is initialized each time block is entered

            System.out.println("y is: " + y);
            // всегда выводится значение -1
            // this always prints -1

            y = 100;
            //Затем ей присваивается значение 100,
            // но по завершении блока кода данного цикла оно теряется.
            System.out.println("y is now: " + y);
        }
    }
}
