package beginners_guide_schildt.chapter14_Lambda.listing5;
// Use a generic functional interface.
@FunctionalInterface
// A generic functional interface with two parameters
// that returns a boolean result.
/**generic functional interface*/
interface SomeTest<T> {
    boolean test(T n, T m); //return type is boolean
}
