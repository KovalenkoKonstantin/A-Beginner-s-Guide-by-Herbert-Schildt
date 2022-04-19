package beginners_guide_schildt.chapter13_Generics.listing4;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, Integer> x = new Pair<>(1,2);
        Pair<Number, Integer> y = new Pair<>(10.4, 27);
        //Pair<Number, String> n = new Pair<Number, String>();
        //Pair<Integer, Object> n1 = new Pair<>();
        Pair<Number, Long> z = new Pair<>(1.564654, 123L);
        Pair<Object, String> stringStringPair = new Pair<>("what ever", "asd");
        Pair<Number, Double> numberDoublePair = new Pair<>(65161, 1d);
        Pair<Number, Byte> numberBytePair = new Pair<>(5436, (byte)1);
        Pair<Object, Boolean> objectBooleanPair = new Pair<>(45, true);
        Pair<Number, Float> objectFloatPair = new Pair<>(45, 55F);
    }
}
