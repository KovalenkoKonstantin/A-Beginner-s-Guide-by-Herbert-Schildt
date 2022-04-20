package chapter14_Lambda.listing2;
// Use the same functional interface with three different lambda expressions.

// A functional interface that takes two int parameters and returns
// a boolean result.
abstract interface NumericTest {
    abstract boolean test (int n, int m);
}
