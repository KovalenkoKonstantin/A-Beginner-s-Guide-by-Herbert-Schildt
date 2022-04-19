package beginners_guide_schildt.chapter2_Типы_данных;

// Using a cast.
// Приведение типов для правильного вычисления выражения
class UseCast {
    public static void main(String args[]) {
        int i;

        for(i = 0; i < 5; i++) {
            System.out.println(i + " / 3 = " + i / 3);
            System.out.println(i + " / 3 с дробной частью with fractions: "
                    + (double) i / 3);
//            System.out.println();//пустая строка после каждой операции
        }
    }
}