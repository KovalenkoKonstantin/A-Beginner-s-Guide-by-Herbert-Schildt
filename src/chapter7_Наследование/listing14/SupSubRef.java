package chapter7_Наследование.listing14;

class SupSubRef {
    public static void main(String args[]) {
        X x = new X(10);
        X x2;
        Y y = new Y(5, 6);

        x2 = x; // OK, both of same type
        System.out.println("x2.a: " + x2.a);

        x2 = y; // still Ok because Y is derived from X
/**Класс Y является подклассом Х, поэтому
переменные x2 и y могут ссылаться на
один н тот же объект производного класса*/
        System.out.println("x2.a: " + x2.a);

        // X references know only about X members
        x2.a = 19; // OK
//    x2.b = 27; // Error, X doesn't have a b member
    }
}
