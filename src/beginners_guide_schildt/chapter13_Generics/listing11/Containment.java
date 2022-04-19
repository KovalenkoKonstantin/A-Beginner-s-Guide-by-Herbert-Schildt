package beginners_guide_schildt.chapter13_Generics.listing11;
// A generic interface example.

// A generic containment interface.
// This interface implies that an implementing
// class contains one or more values.
interface Containment<T> {
    // The contains() method tests if a
    // specific item is contained within
    // an object that implements Containment.
    boolean contains(T o);
}

