package chapter13_Generics.listing1;
// Demonstrate the generic class.
class GenDemo {
    public static void main(String args[]) {
        // Create a Gen reference for Integers.
        Gen<Integer> iOb; //Создание ссыпки на о6ъект типа Gen<Integer>

        // Create a Gen<Integer> object and assign its
        // reference to iOb.  Notice the use of autoboxing
        // to encapsulate the value 88 within an Integer object.
        iOb = new Gen<Integer>(88); //Создание экземпляра типа Gen<Integer>

        Gen<Long> iob1 = new Gen<>(99L);

        // Show the type of data used by iOb.
        iOb.showType();
        iob1.showType();

        // Get the value in iOb. Notice that
        // no cast is needed.
        int v = iOb.getob();
        System.out.println("Get the value of iOb: " + v);
        System.out.println("Get the value of iOb: " + iOb.getob());
        System.out.println("Get the value of iOb1: " + iob1.getob());

        System.out.println();

        // Create a Generic object for Strings.
        Gen<String> strOb = new Gen<String>("Generics Test");
        Gen<String> strOb1 = new Gen<>("Generics Test1");

        // Show the type of data used by strOb.
        strOb.showType();
        strOb1.showType();

        // Get the value of strOb. Again, notice
        // that no cast is needed.
        String str = strOb.getob();
        String str2 = strOb1.getob();
        System.out.println("value: of String Generic strOb equals " + str +
                "\nvalue: of String Generic strOb1 equal" + str2);
    }
}
