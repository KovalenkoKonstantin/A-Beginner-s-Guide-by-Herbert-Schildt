package beginners_guide_schildt.chapter13_Generics.listing5;
// Use a wildcard.
class NumericFns<T extends Number> {
    T num;

    // Pass the constructor a reference to
    // a numeric object.
    NumericFns(T n) {
        num = n;
    }

    // Return the reciprocal.
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // Determine if the absolute values of two
    // objects are the same.
//для определения абсолютного значения каждого числа используется
//стандартный метод Math. abs ()
    boolean absEqual(NumericFns<?> ob) {
        if(Math.abs(num.doubleValue()) ==
                Math.abs(ob.num.doubleValue())) return true;
        else return false;
    }
}
