package beginners_guide_schildt.chapter2_Типы_данных;

//Демонстрация использования операции%
// Demonstrate the % operator.
class ModDemo {
    public static void main(String args[]) {
        int iresult = 10/3, irem = 10%3;
        double dresult = 10.0/3.0, drem = 10.0%3.0;
        //важно проставлять точку с нулевыми значениями.
        // в противном случае вычисление будет выполнено неверно.

//        iresult = 10 / 3;
//        irem = 10 % 3;

//        dresult = 10.0 / 3.0;
//        drem = 10.0 % 3.0;

        System.out.println("Peзyльтaт и остаток от деления \nResult and remainder of \n10 / 3: " +
                iresult + " и " + irem);
        System.out.println("Peзyльтaт и остаток от деления \nResult and remainder of \n10.0 / 3.0: " +
                dresult + " и " + drem);

    }
}
