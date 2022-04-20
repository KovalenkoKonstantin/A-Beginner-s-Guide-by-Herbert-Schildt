package chapter13_Generics.listing5;
// Demonstrate a wildcard.
class WildcardDemo {
    public static void main(String args[]) {

        NumericFns<Integer> iOb = new NumericFns<>(6);

        NumericFns<Double> dOb = new NumericFns<>(-6.0);

        NumericFns<Long> lOb = new NumericFns<>(5L);

        System.out.println("Testing iOb and dOb.");
        if(iOb.absEqual(dOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");

        System.out.println();

        System.out.println("Testing iOb and lOb.");
        if(iOb.absEqual(lOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
    }
}
