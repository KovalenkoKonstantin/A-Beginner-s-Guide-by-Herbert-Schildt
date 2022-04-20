package chapter6_Static.listing9;

class OverloadDemo {
    public static void main(String args[]) {
        Overload object = new Overload();
        //int x;
        //double y;

        // Поочередно вызвать все версии метода ovlDemo()
        object.ovlDemo(); //первая версия
        //метод ovlDemo выводит на печать ("Бeз параметров")
        //System.out.println();

        object.ovlDemo(2); //вторая версия
        //метод ovlDemo выводит на печать ("Один параметр: " + a)
        System.out.println();

        int x = object.ovlDemo(4, 6); //третья версия
        //метод ovlDemo выводит на печать ("Двa параметра: " + a + " и " + b)
        System.out.println("Peзyльтaт вызова object.ovlDemo(4, 6): " + x);
        //метод ovlDemo возвращает значение a + b и присваивается значению x
        System.out.println();


        double y = object.ovlDemo(1.11, 2.22); //четвёртая версия
        //метод ovlDemo выводит на печать ("Двa параметра типа double: " + a + " "+ b)
        System.out.println("Peзyльтaт вызова object.ovlDemo(1.11, 2.22): " + y);
        //метод ovlDemo возвращает значение b - a и присваивается значению y
    }
}
