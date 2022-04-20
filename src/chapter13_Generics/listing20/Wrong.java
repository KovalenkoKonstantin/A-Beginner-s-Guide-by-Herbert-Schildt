package chapter13_Generics.listing20;
class Wrong<T> {
    public static void main(String[] args) {

    }
    // Wrong, no static variables of type T.
    //static T ob;

    // Wrong, no static method can use T.
    /*static T getob() {
        return ob;
    }*/

    // Wrong, no static method can access object
    // of type T.
    /*static void showob() {
        System.out.println(ob);
    }*/
}
