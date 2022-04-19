package beginners_guide_schildt.chapter6_Static.listing11;

// Добавление версии метода f(byte).
class Overload2 {
    void f(byte x) { //Эта версия принимает параметр типа byte
        System.out.println("Внутри метода f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Внутри метода f(int): " + x);
    }

    void f(double x) {
        System.out.println("Внутри метода f(double): " + x);
    }
}
