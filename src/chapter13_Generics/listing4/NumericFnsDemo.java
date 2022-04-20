package chapter13_Generics.listing4;

public class NumericFnsDemo {
    public static void main(String[] args) {
        NumericFns<?> dob = new NumericFns<>(1.25);
        NumericFns<?> fob = new NumericFns<>(-1.25F);

        if (dob.absEqual(fob))
            System.out.println("Абсолютные значения совпадают");
        else
            System.out.println("Не совпадают");
        System.out.println();
        if (dob.equals(fob))
            System.out.println("Совпадают");
        else
            System.out.println("Не совпадают");
    }
}
