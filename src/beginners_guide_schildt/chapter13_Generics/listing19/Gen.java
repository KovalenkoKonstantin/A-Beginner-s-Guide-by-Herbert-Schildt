package beginners_guide_schildt.chapter13_Generics.listing19;
// Can't create an instance of T.
class Gen<T> {
    T ob;
    Gen() {
        //Type parameter 'T' cannot be instantiated directly
        //ob = new T(); // Illegal!!!
    }
}
