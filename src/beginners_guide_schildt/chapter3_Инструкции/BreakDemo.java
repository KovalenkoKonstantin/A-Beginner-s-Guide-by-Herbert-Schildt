package beginners_guide_schildt.chapter3_Инструкции;

// Using break to exit a loop.
// Применение оператора break для выхода из цикла
class BreakDemo {
    public static void main(String args[]) {
        int x = 100;

        // Выполнять цикл до тех пор, пока квадрат значения
        // переменной i меньше значения переменной num
        for(int i=0; i < x; i++) {
            if(i*i > x) break; // прекратить цикл, если i*i >= 100
            System.out.print(i + " ");
        }
        System.out.println("\nЦикл завершён.");
    }
}
