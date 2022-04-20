package chapter4_Методы;

class ConsDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass(10); //конструктор вызывается оператором new при создании
                                    //объекта данного класса
                                    //В этой строке кода для объекта tl вызывается
                                    //конструктор MyClass (), в котором
                                    //значение 10 сначала передается параметру i
                                    //данного конструктора, а затем присваивается переменной х:
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }
}