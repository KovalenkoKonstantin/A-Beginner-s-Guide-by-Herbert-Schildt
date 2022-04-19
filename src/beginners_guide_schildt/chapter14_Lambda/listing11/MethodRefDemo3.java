package beginners_guide_schildt.chapter14_Lambda.listing11;
class MethodRefDemo3 {
    public static void main(String args[])
    {
        boolean result, result1;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // This makes inp refer to the instance method isFactor().
        /**Если ссылаться на название класса MyIntNum,
         * тогда необходимо объект класса mv с названием его класса MyIntNum
         * передевать в аргументы метода test()
         * функционального интерфейса MyIntNumPredicate*/
        MyIntNumPredicate inp = MyIntNum::isFactor;

        // The following calls isFactor() on myNum.
        result = inp.test(myNum, 3);
        //the same as if
        result1 = myNum.isFactor(3);
        if(result1)
            System.out.println(myNum.getFactor() + " is a factor of " + myNum.getNum());
        if(result)
            System.out.println(myNum.getFactor() + " is a factor of " + myNum.getNum());

        // The following calls isFactor() on myNum2.
        result = inp.test(myNum2, 3);
        if(!result)
            System.out.println(myNum2.getFactor() + " is a not a factor of " + myNum2.getNum());
    }
}
