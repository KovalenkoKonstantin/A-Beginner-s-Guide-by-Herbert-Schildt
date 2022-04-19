package beginners_guide_schildt.chapter6_Static.listing10;
//в Java применяется автоматическое приведение типов. Это
//приведение распространяется и на типы параметров перегружаемых методов
class TypeConv {
    public static void main(String args[]) {
        Overload2 object = new Overload2(); //создаётся новый оббъект класса

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float x = 11.5F;


        object.foo(i); // вызов метода object.foo(int)
        object.foo(d); // вызов метода object.foo(double)
        System.out.println();
        object.foo(b); // вызов метода object.foo(int) -- с преобразованием типов
        object.foo(s); // вызов метода object.foo(int) -- с преобразованием типов
        object.foo(x); // вызов метода object.foo(double) -- с преобразованием типов
    } /*В данном примере определены только два варианта метода f () : один принимает
    параметр типа int, а второй - параметр типа douЫe. Но передать методу f () можно
    также значение типа byte, short и float. Значения типа byte и short исполняющая
    система Java автоматически преобразует в тип int. В результате будет вызван вариант
    метода f (int). А если параметр имеет значение типа float, то оно преобразуется в тип
    douЫe, и далее вызывается вариант метода f (douЫe).*/
}
