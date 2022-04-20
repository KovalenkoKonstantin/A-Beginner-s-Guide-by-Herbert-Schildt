package chapter14_Lambda.listing10;
// Use a method reference to an instance method.

// A functional interface for numeric predicates that operate
// on integer values.
interface IntPredicate {
    boolean test(int n);
}
