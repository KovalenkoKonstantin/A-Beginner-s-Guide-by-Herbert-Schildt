package chapter13_Generics.listing11;
// Implement Containment interface using an array to hold the values.
//Любой класс реализующий обобщённый интерфейс так же должне быть обобщённым
class MyClass <T> implements Containment<T> {
    T[] arrayRef;

    MyClass(T[] o) {
        arrayRef = o;
    }

    // Implement Contains.
    @Override
    public boolean contains(T o) {
        for(T x : arrayRef)
            if(x.equals(o)) return true;
        return false;
    }
}
