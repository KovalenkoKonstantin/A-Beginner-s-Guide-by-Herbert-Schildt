package chapter14_Lambda.listing2_1;
class LambdaDemo2 {
    public static void main(String args[])
    {
        // This lambda expression determines if one number is
        // a factor of another.
        NumericTest <Integer, Integer> isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");
        if(!isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10");
        System.out.println();

        // This lambda expression returns true if the first
        // argument is less than the second.
        NumericTest <Double, Double> lessThan = (n, m) -> (n < m);

        if(lessThan.test(2.0, 10.0))
            System.out.println("2.0 is less than 10.0");
        if(!lessThan.test(10.0, 2.0))
            System.out.println("10.0 is not less than 2.0");
        System.out.println();

        // This lambda expression returns true if the absolute
        // values of the arguments are equal.
        /**логическоеУсловие ? выражение1 : выражение2
         * Если логическое Условие равно true, то вычисляется выражение1
         * и его результат становится результатом выполнения
         * всего оператора. Если же логическое Условие равно false,
         * то вычисляется выражение2, и его значение становится
         * результатом работы оператора. Оба операнда выражение1
         * и выражение2 должны возвращать значение одинакового
         * (или совместимого) типа.*/
        NumericTest <Long, Long>absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

        if(absEqual.test(4L, -4L))
            System.out.println("Absolute values of 4 and -4 are equal.");
        if(!absEqual.test(4L, -5L))
            System.out.println("Absolute values of 4 and -5 are not equal.");
        System.out.println();
    }
}
