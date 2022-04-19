package beginners_guide_schildt.chapter6_Static.listing6;

class PassObjRef {
    public static void main(String args[]) {
        Test_v1 object = new Test_v1(15, 20);

        System.out.println("object.a и object.b перед вызовом: " +
                object.a + " " + object.b);

        object.change(object);
        //        ob.a = ob.a + ob.b;
        //        ob.b = -ob.b

        System.out.println("object.a и object.b после вызова: " +
                object.a + " " + object.b);
    }
}
