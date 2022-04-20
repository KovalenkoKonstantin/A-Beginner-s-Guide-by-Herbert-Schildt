package chapter14_Lambda.listing13;
/**
 * Use the Predicate built-in functional interface.
 * Import the Function interface.
 * public interface Predicate<T> {boolean test(T t);}
 */

import java.util.function.Predicate;
import java.util.function.Supplier;

class UsePredicateInterface {
    public static void main(String args[]) {
        SubClassForGetters<Integer> subG = new SubClassForGetters<>(4);
        System.out.println(subG.getI());

        // This lambda uses Predicate<Integer> to determine
        // if a number is even/чётное.
        /**Используется встроенный интерфейс Predicate*/
        Predicate<Integer> isEven = (n) -> (n % 2) == 0;
        if (isEven.test(4)) System.out.println("4 is even/чётное");
        if (!isEven.test(5)) System.out.println("5 is odd/нечётное");

        Predicate<Double> isPositive = n -> (n > 0);
        if (isPositive.test(5.0)) System.out.println("5 is positive");

        Predicate<String> isA = n -> (n.equals("a"));
        if (isA.test("a")) System.out.println("a equals a");

        Supplier<Integer> sInt = () -> subG.getI();
        System.out.println(sInt.get());
    }
}
