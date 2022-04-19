package beginners_guide_schildt.chapter9_Exceptions.tasks;

public class A extends Exception {
    int x , y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override /**from Throwable and that from Object*/
    public String toString() {
        return "handled exception from A - ArithmeticException";
    }
}
