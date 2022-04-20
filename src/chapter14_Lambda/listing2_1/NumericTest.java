package chapter14_Lambda.listing2_1;
// Use the same functional interface with three different lambda expressions.

// A functional interface that takes two int parameters and returns
// a boolean result.
abstract interface NumericTest <T extends Number, V extends T>{
    abstract boolean test (T n, V m);
}
