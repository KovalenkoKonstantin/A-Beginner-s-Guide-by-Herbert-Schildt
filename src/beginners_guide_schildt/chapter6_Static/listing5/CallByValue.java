package beginners_guide_schildt.chapter6_Static.listing5;

class CallByValue {
    public static void main(String args[]) {
        Test object = new Test();

        int a = 15, b = 20;

        System.out.println("a и b перед вызовом: " +
                a + " " + b);

        object.noChange(a, b); //метод

        System.out.println("a и b после вызова: " +
                a +" " + b);
        //действия, выполняемые в теле метода noChange () , никоим образом не
        //влияют на значения переменных а и Ь в вызывающем методе.
    }
}
