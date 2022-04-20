package chapter14_Lambda.listing12_1;

import beginners_guide_schildt.self_annotations.Constructor;
import beginners_guide_schildt.self_annotations.Getter;

 class MyClass {
    private int anInt;

    // This constructor takes an argument.
    @Constructor
    MyClass(Integer integer) { this.anInt = integer; }

    @Getter
    public int getAnInt() {
        return anInt;
    }
}
