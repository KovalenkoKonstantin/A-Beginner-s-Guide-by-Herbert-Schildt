package chapter13_Generics.listing2;
// Demonstrate TwoGen.
class SimpGen {
    public static void main(String args[]) {
//Передача типа Integer параметру Т и типа String параметру V
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
        TwoGen<Integer, String> tgObj1 = new TwoGen<>(2121, "Genericsisists");

        // Show the types.
        tgObj.showTypes();
        tgObj1.showTypes();

        // Obtain and show values.
        int v = tgObj.getob1();
        System.out.println("value: " + v);
        System.out.println("value: " + tgObj.getob1());
        System.out.println("value: " + tgObj1.getob2());

        String str = tgObj.getob2();
        System.out.println("value: " + str);
    }
}
