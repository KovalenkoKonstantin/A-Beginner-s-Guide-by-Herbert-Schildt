package beginners_guide_schildt.chapter14_Lambda.listing12;
// Demonstrate a Constructor reference.

/**
 * MyFunc is a functional interface whose method returns
 * a MyClass reference.
 */
interface MyFunc {
    abstract MyClass func(String s);
}
