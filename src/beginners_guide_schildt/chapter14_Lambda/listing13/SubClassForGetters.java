package beginners_guide_schildt.chapter14_Lambda.listing13;

public class SubClassForGetters<T extends Number> {
    private T i;

    public SubClassForGetters(T i) {
        this.i = i;
    }

    public T getI() {
        return i;
    }
}
