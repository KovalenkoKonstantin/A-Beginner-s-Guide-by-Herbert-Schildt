package beginners_guide_schildt.chapter7_Наследование.listing17;

class Override {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);

        subOb.show(); // this calls show() in B
    }
}