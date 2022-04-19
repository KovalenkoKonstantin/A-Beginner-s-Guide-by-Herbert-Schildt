package beginners_guide_schildt.chapter7_Наследование.listing16;

class Override {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);

        subOb.show(); // this calls show() in B

        A a = new A (10,12);

        a.show();
    }
}
