package chapter13_Generics.listing4;

public class Pair<T, V extends T> {
    T first;
    V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }
}
