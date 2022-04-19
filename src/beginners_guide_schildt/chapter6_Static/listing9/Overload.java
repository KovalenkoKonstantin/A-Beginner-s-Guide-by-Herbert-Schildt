package beginners_guide_schildt.chapter6_Static.listing9;

// Перегрузка методов.
class Overload {
    void ovlDemo() { //первая версия
        System.out.println("Бeз параметров");
    }

    // Overload ovlDemo for one integer parameter.
    void ovlDemo(int a) { //вторая версия
        System.out.println("Один параметр: " + a);
    }

    // Overload ovlDemo for two integer parameters.
    int ovlDemo(int a, int b) { //третья версия
        //метод возвращает значение типа int
        System.out.println("Двa параметра: " + a + " и " + b);
        return a + b;
    }

    // Overload ovlDemo for two double parameters.
    double ovlDemo(double a, double b) { //четвёртая версия
        //метод возвращает значение типа double
        System.out.println("Двa параметра типа double: " + a + " "+ b);
        return b - a;
    }
}
