package beginners_guide_schildt.chapter14_Lambda.listing10;
import beginners_guide_schildt.self_annotations.*;
// This class stores an int value and defines the instance/пример
// method isFactor(), which returns true if its argument
// is a factor/делитель of the stored value.
class MyIntNum {
    private int v;
    private int f;

@Constructor
    MyIntNum(int x) { v = x; }
@Getter
    int getNum() { return v; }

    // Return true if n is a factor of v.
    boolean isFactor(int n) {
        f = n;
        return (v % n) == 0;
    }
    @Getter
    int getFactor() { return f;}

}
