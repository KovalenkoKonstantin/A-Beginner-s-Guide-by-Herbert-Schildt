package beginners_guide_schildt.chapter2_Типы_данных;

/*  Эта программа не пройдет компиляцию
   This program attempts to declared a variable
   in an inner scope with the same name as one
   defined in an outer scope.

   *** This program will not compile. ***
*/
class NestVar {
    public static void main(String args[]) {
        int count;

        for(count = 0; count < 10; count++) {
            System.out.println("This is count: " + count);

//            int count;
            // Недопустимо! ! !
            // Нельзя объявить переменную count, поскольку ранее она уже была объявлена
            // illegal!!!
/*            for(count = 0; count < 2; count++)
                System.out.println("This program is in error!");*/
        }
    }
}
