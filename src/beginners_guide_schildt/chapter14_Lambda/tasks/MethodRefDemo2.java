package beginners_guide_schildt.chapter14_Lambda.tasks;

/**
 * В программе MethodRefDemo2 добавьте в класс MyIntNum новый метод
 * hasCommonFactor(). Этот метод должен возвращать true, если его аргумент
 * типа int и значение, которое хранится в вызывающем объекте MyintNum, имеют
 * по крайней мере один общий делитель.
 * Продемонстрируйте работу метода hasCommonFactor(), используя ссылку на метод.
 */
class MethodRefDemo2 {

    public static void main(String args[]) {
        boolean result;
        int v = 185, f = 37;

        MyIntNum myNum = new MyIntNum(v);

        myNum.commonFactor(f);
        System.out.println("первое число: " + myNum.getV() + "\nвторое число: "
                + myNum.getF() + "\nнаименьший делитель обоих чисел: " +
                myNum.commonFactor(f));
        if (myNum.isFactor(f))
            System.out.println("Первое число делится на второе");
        else System.out.println("Первое число НЕ делится на второе");

        if (myNum.devideOneAnother(v, f))
            System.out.println(myNum.getV() + " и " + myNum.getF() +
                    " нацело делятся друг на друга");
        else System.out.println(myNum.getV() + " и " + myNum.getF() +
                " нацело НЕ делятся друг на друга");

        // Here, a method reference to hasCommonFactorNew on myNum is created.
        /**Если ссылаться на объект myNum класса MyIntNum,
         * тогда нет необходимости объект класса mv с названием его класса MyIntNum
         * передевать в аргументы метода test()
         * функционального интерфейса IntPredicate*/
        IntPredicate ip = myNum::hasCommonFactor; //ссылка на метод экземпляра

        /**вызывается метод ip.test() с передачей ему ссылки на метод
         hasCommonFactorNew() соответствующего экземпляра*/
        result = ip.test(f);
        if (result) System.out.println(myNum.getV() + " и " + myNum.getF() +
                " имеют по крайней мере один делитель отличный от 1");
        else System.out.println(myNum.getV() + " и " + myNum.getF() +
                " НЕ имеют общих делителей отличных от 1");
    }
}
