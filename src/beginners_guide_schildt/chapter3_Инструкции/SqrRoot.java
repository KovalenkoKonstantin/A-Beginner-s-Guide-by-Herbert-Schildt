package beginners_guide_schildt.chapter3_Инструкции;

// ShowInputFromKeyboard square roots of 1 to 99 and the rounding error.
// Вывод квадратных корней чисел от 1 до 99
class SqrRoot {
    public static void main(String args[]) {
        double a, b, c;

        for(a = 1.0; a < 100.0; a++) {
            b = Math.sqrt(a);//обращение к классу 'Math', обращение к методу 'sqrt' (Square root)
            System.out.println("Корень квадратный из " + a +
                    " равен " + b);

            // compute rounding error
            // вычислить ошибку округления
            c = a - (b * b);
            System.out.println("Ошибка округления " + c);
            System.out.println();
            //добавляется пустая строка после каждого прохождения цикла оператора for
        }
    }
}
