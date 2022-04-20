package chapter13_Generics.listing4;

// In this version of NumericFns, the type argument
// for T must be either Number, or a class derived
// from Number.
//В данном случае аргументом типа должен быть либо number, либо подкласс NumЬer
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

    public boolean absEqual(NumericFns<?> ob) {
        if (Math.abs(ob.num.doubleValue()) == Math.abs(ob.num.floatValue())
        ) return true;
        else return false;
    }
}
