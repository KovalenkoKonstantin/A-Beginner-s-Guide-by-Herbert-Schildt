package beginners_guide_schildt.chapter14_Lambda.listing9;
// Demonstrate a method reference for a static method.

// A functional interface for numeric predicates/утверждение that operate
// on integer values.
/**Функциональный интерфейс
 IntPredicate, имеющий метод test ().
 Этот метод принимает параметр типа
 int и возвращает результат типа boolean.*/
@FunctionalInterface
interface IntPredicate {
    boolean test(int n);
}
