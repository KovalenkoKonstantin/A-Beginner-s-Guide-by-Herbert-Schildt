package beginners_guide_schildt.chapter14_Lambda.listing4;
// A block lambda that finds the smallest positive factor
// of an int value.
@FunctionalInterface
public
interface NumericFunc {
    int func(int n); //return type is integer
}
