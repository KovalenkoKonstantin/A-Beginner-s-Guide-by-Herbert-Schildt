package beginners_guide_schildt.chapter13_Generics.listing17;

// Demonstrate raw type.
class RawDemo {
    public static void main(String args[]) {

        // Create a Gen object for Integers.
        Gen<Integer> iOb = new Gen<>(88);

        // Create a Gen object for Strings.
        Gen<String> strOb = new Gen<>("Generics Test");

        // Create a raw-type Gen object and give it
        // a Double value.
//В данном случае аргументы типа не указываются. В итоге создается объект класса
//Gen, тип T которого заменяется типом Object.
        Gen raw = new Gen(new Double(98.6)); //Еспи аргумент типа не предоставляется, создается базовый тип

        // Cast here is necessary because type is unknown.
        double d = (Double) raw.getob();
        System.out.println("value: " + d);

        // The use of a raw type can lead to run-time exceptions.
        // Here are some examples.

        // The following cast causes a run-time error!
        //Безопасность использования базового типа не проверяется
        try {
            int i = (Integer) raw.getob(); // run-time error
        } catch (ClassCastException e) {
            System.err.println("Casting Mistake");
        }

        // This assigment overrides type safety.
        strOb = raw; // OK, but potentially wrong
        try {
            String str = strOb.getob(); // run-time error
        } catch (ClassCastException e) {
            System.err.println("Casting Mistake");
        }
        // This assingment also overrides type safety.
        raw = iOb; // OK, but potentially wrong
        try {
        d = (Double) raw.getob(); // run-time error
        } catch (ClassCastException e) {
            System.err.println("Casting Mistake");
        }
    }
}
