package chapter6_Static.listing10;

/* Автоматическое преобразование типов может влиять
   на выбор перегружаемого метода.
*/
class Overload2 {
    void foo(int x) { //method
        System.out.println("Внутри метода foo(int): " + x );
    }

    void foo(double x) { //method
        System.out.println("Внутри метода foo(double): " + x );
    }
}
