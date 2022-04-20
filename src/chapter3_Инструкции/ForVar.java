package chapter3_Инструкции;

// Declare loop control variable inside the for.
// Объявление переменной цикла в самом цикле for.
class ForVar {
    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;

        // compute the factorial of the numbers through 5
        // Вычисление факториала чисел от 1 до 5
        for(int i = 1; i <= 5; i++) {
            sum += i;  // переменная i доступна во всем цикле. sum = sum + i;
            // с каждой итерацией переменная sum увеличивается на i
            fact *= i;// fact = fact * i
            // с каждой итерацией переменная fact умножается на i
            // вычисляются сумма и факториал чисел от 1 до 5,
            // а переменная i, управляющая циклом for, объявляется в самом цикле.
        }

        // однако здесь переменная i недоступна

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
