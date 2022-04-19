package beginners_guide_schildt.chapter9_Exceptions.tasks;

public class B extends A {
    public B(int x, int y) {
        super(x, y);
    }
    @Override /**from Throwable and that from Object*/
    public String toString() {
        return "handled exception from B - Result of " + x + " divide " + y + " equals = " + (double)x/y +
                " that is non-integer.";
    }
}
