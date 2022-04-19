package beginners_guide_schildt.chapter6_Static.listing1;

// Сравнение видов доступа Public vs private.
class MyClass {
    private int alpha; // закрытый доступ
    public int beta; // открытый доступ
    int gamma; // тип доступа по умолчанию (по сути, puЫic)

    /* Методы доступа к переменной alpha. Члены класса могут
       обращаться к закрытым членам того же класса.
    */
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}
