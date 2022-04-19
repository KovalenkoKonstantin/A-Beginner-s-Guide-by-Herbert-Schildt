package beginners_guide_schildt.chapter7_Наследование.listing19;

class DynDispDemo {
    public static void main(String args[]) {
        Sup superOb = new Sup(); //создаются объекты типа Sup, Su1 и Sub2
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef; //объявляется переменная
        //supRef, ссылающаяся на объект типа Sup

        supRef = superOb;
        supRef.who(); //ссылки используются для вызова метода who ()

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();
//вызов вверсии метода who() осуществляется по типу объекта,
// на который указывает ссылка во времы выполнения

    }
}