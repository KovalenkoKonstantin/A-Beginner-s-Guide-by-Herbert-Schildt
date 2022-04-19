package beginners_guide_schildt.chapter13_Generics.listing8;

import beginners_guide_schildt.chapter13_Generics.listing6.*;
import beginners_guide_schildt.chapter13_Generics.listing7.Generic;

class UseBoundedWildcard {
    // Here, the ? will match A or any class type that
    // that extends A
    // В объявлении этого метода используется ограниченный
    // метасимвольный аргумент.
    static void test(Generic<? extends A> o) {
    }
    static void test1(Generic<? super A> o) {
    }
    static void test2(Generic<? super C> o) {
    }
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        Generic<A> w = new Generic<>(a);
        Generic<B> w2 = new Generic<>(b);
        Generic<C> w3 = new Generic<>(c);
        Generic<D> w4 = new Generic<>(d);
        Generic<E> w5 = new Generic<>(e);

        // These calls to test() are OK.
        test(w);
        test(w2);
        test(w3);
        test1(w);
        test2(w3);
        test2(w);

        // Can't call test() with w4 because
        // it is not an object of a class that
        // inherits A.
        //ограниченный шаблон аргумента в методе test () не позволяет
        // передавать ему объект w4 в качестве параметра
        //test(w4); // Error!
        //super ограничивает нижнюю границу и ничего кроме объектов класса А не передать
        //test1(w2);
        //super ограничивает нижнюю границу и ничего за пределами цепочки
        //объектов класса С не передать
        //test2(w5);
        //test2(w2);
    }
}
