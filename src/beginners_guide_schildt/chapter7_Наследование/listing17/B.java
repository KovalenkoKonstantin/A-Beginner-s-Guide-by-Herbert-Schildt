package beginners_guide_schildt.chapter7_Наследование.listing17;

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show() {
        super.show(); // this calls A's show()
        System.out.println("k: " + k);
    }
}
