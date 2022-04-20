package chapter13_Generics.listing18;
// Ambiguity caused by erasure on
// overloaded methods.
class MyGenClass<T, V> {
    T ob1;
    V ob2;

    // ...

    // These two overloaded methods are ambiguous
    // and will not compile.
    //both methods have same erasure
    /*void set(T o) {
        ob1 = o;
    }*/

    void set(V o) {
        ob2 = o;
    }
}
