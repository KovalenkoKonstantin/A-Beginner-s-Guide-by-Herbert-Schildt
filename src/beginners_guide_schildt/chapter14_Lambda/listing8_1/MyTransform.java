package beginners_guide_schildt.chapter14_Lambda.listing8_1;
@FunctionalInterface
public abstract interface MyTransform <T> {
    abstract void transform (T [] a);
}
