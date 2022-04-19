package beginners_guide_schildt.chapter13_Generics.listing1;
// A simple generic class.
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.
class Gen<T> { //В объявлении этого класса Т означает обобщенный тип
    T ob; // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getob() {
        return ob;
    }

    // Show type of T.
    void showType() {
        System.out.println("Type of " + ob + " is " +
                ob.getClass().getName());
    }
}
