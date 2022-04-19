package beginners_guide_schildt.chapter14_Lambda.listing4;

class BlockLambdaDemov1 {
    public static void main(String args[])
    {
        int a = 654645;
        int b = -951374;

        Func func = new Func(a);
        Func func1 = new Func(b);
        Func func2 = new Func(125);

        /**Если ссылаться на название класса Func,
         * тогда необходимо объект f и название класса Func
         * передевать в аргументы метода func()
         * функционального интерфейса NumericFuncv1*/
        NumericFuncv1 smallestF = Func::smallestFactor;

        System.out.println("Smallest factor of " + func.getN() + " is " + smallestF.func(func,a));
        System.out.println("Smallest factor of " + func1.getN() + " is " + func1.smallestFactor(b));
        System.out.println("Smallest factor of " + func2.getN() + " is " + func2.smallestFactor(125));
    }
}
