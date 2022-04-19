package beginners_guide_schildt.chapter2_Типы_данных;

// Demonstrate casting.
// Демонстрация приведения типов
class CastDemo {
    public static void main(String args[]) {
        double x = 10.0, y = 3.0;
        byte b;
        int i, a, c ;//объявляются переменные i,a,c типа int
        char ch;

        i = (int) (x / y);
        a = (int) (x % y);
        // cast double to int
        // (x/y) является аргументом типа double
        // приведение типа double к типу int
        // В данном случае теряется дробная часть числа
        System.out.println("Целочисленный результат деления х / у: Integer outcome of x / y:  equals " + i);
        System.out.println("При этом был \"потерян\" остаток от деление равный: " + a + "\n");

        i = 100; //переменной i присваивается значение 100
        //при этом переменная i остаётся типа int
        b = (byte) i;// приведение типа int к типу byte
        System.out.println("Значение Ь: Value of b:  equals: " + b +"\n");
        // А в этом случае информацня не теряется
        // т.к. тип byte может содержать значение lОО

        i = 600;//переменной i (типа int) присваивается значение 257
        b = (byte) i;// приведение типа int к типу byte
        System.out.println("Value of b  equals: " + b );
        //На этот раз информация теряется т.к. тип byte не может содержать значение 257
        c = i - b;
        System.out.println("При этом было потеряно: "+ c +"\n");

        b = 88; //переменной b присваивается значение 88
        // ASCII code for X
        // Представление символа Х в коде ASCII
        ch = (char) b;// приведение типа byte к типу char
        System.out.println("В кодировке ASCII число: " + b + " преобразуется в: " + ch);
    }
}
