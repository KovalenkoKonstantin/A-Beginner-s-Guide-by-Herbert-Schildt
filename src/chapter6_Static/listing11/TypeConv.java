package chapter6_Static.listing11;

class TypeConv {
    public static void main(String args[]) {
        Overload2 ob = new Overload2();

        int i = 10;
        double d = 10.1;

        byte b = 99;
        short s = 10;
        float y = 11.5F;


        ob.f(i); // вызов метода ob.y(int)
        ob.f(d); // вызов метода ob.y(double)

        ob.f(b); // вызов метода ob.y(byte) -- без преобразования типов

        ob.f(s); // вызов метода ob.y(int) -- с преобразованием типов
        ob.f(y); // вызов метода ob.y(double) -- с преобразованием типов
    }
//Поскольку в данной программе предусмотрена версия метода f () , которая принимает
//параметр типа byte, то при вызове этого метода с аргументом типа byte выполняется
//вызов f (byte), и автоматического преобразования типа byte в тип int не происходит.
}
