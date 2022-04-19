package beginners_guide_schildt.chapter14_Lambda.tasks;
import beginners_guide_schildt.chapter14_Lambda.listing4.NumericFunc;
/**
 * Создайте блочное лямбда-выражение для вычисления факториала целого числа.
 * Продемонстрируйте его использование. В качестве функционального интерфейса
 * используйте интерфейс NumericFunc, который рассматривался в этой главе.
 */
class FactorialDemo {
    public static void main(String args[]) {
        int a = 5;
        int b = -2;

        Factorial fak = new Factorial(a);
        Factorial fak1 = new Factorial(b);
        Factorial fak2 = new Factorial(9);

        NumericFunc calculateF = fak::factorial;

        System.out.println("Факториал числа: " + fak.getN() + "! это " + calculateF.func(a));
        System.out.println("Факториал числа: " + fak1.getN() + "! это " + fak1.factorial(b));
        System.out.println("Факториал числа: " + fak2.getN() + "! это " + fak2.factorial(9));

        MyFunc<Double> factorial = (n) -> {
            double result = 1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        };
        System.out.println("Факториал числа: 3.0! это " + factorial.func(3.0));
    }
}
