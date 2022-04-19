package beginners_guide_schildt.chapter3_Инструкции;

// Loop until an S is typed.
// Выполнение цикла до тех пор, пока с клавиатуры
// не будет введена буква S
class ForTest {
    public static void main(String args[])
            throws java.io.IOException {
        //Оператор throws java.io.IOException требуется
        //для обработки ошибок, которые могут возникнуть в процессе ввода данных.
        int i;

        System.out.println("Press S to stop.");

        for(i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Проход № " + i);
        // Возвращаемый символ представлен целочисленным значением,
        // и поэтому, прежде чем присвоить его символьной переменной,
        // следует выполнить явное его приведение к типу char
        // цикл остановит своё выполнение только в случае введения правильного значения
    }
}
