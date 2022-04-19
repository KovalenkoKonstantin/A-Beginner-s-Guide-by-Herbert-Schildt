package beginners_guide_schildt.chapter14_Lambda.listing12;
class ConstructorRefDemo {
    public static void main(String args[])
    {
        // Create a reference to the MyClass constructor.
        // Because func() in MyFunc takes an argument, new
        // refers to the parameterized constructor in MyClass,
        // not to the default constructor.
        /**В общем случае при использовании ссылок вида ::new будет вызываться конструктор,
         параметры которого соответствуют параметрам, указанным в функциональном интерфейсе*/
        MyFunc myClassCons = MyClass::new; //ссылка на конструктор

        // Create an instance/экземпляр of MyClass via that constructor reference.
        MyClass mc = myClassCons.func("Testing");

        // Use the instance of MyClass just created.
        System.out.println("str in mc is " + mc.getStr());

        MyFuncv2 myClassCons2 = MyClass::new;
        MyClass mc2 = myClassCons2.func();
        System.out.println("str in mc2 is " + mc2.getStr() + "empty");
    }
}
