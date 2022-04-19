package beginners_guide_schildt.chapter14_Lambda.listing7;
// An example of capturing a local variable from the enclosing scope.
@FunctionalInterface
abstract interface MyFunc {
    /**abstract method of the functional interface*/
    abstract int func(int n);

    default int basic(int k) {
        return k;
    }
}
