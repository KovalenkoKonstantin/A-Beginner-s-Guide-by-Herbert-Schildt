package beginners_guide_schildt.chapter2_Типы_данных;

// A promotion surprise!
// Неожиданный результат повышения типов!
class PromDemo {
    public static void main(String args[]) {
        byte b = 10;
        int i = b*b;
        // OK, no cast needed
        // Приведение типов не требуется, так как тип уже повышен до int

        b = 9;
        b = (byte) (b * b);
        // cast needed!!
        // Здесь для присваивания значения int переменной типа byte требуется приведение типов

        System.out.println("i and b: " + i + " " + b);
    }
}