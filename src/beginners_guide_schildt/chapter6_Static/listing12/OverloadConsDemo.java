package beginners_guide_schildt.chapter6_Static.listing12;

class OverloadConsDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(88);
        MyClass t3 = new MyClass(17.93F);
        MyClass t4 = new MyClass(2, 5);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
//В данном примере конструктор MyClass () перегружается четырежды. Во всех перегруженных
//версиях этого конструктора объект типа MyClass строится по-разному.
//Конкретный вариант конструктора выбирается на основании параметров, которые указываются
//при выполнении оператора new. Перегружая конструктор класса, вы предоставляете
//пользователю созданного вами класса свободу в выборе способа конструирования
//объекта.
    }
}
