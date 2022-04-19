package beginners_guide_schildt.chapter14_Lambda.listing9;
class MethodRefDemo {

    // This method has a functional interface as the type of its
    // first parameter. Thus, it can be passed a reference to any
    // instance of that interface, including one created by a
    // method reference.
    static boolean numTest(IntPredicate p, int v) {
        return p.test(v);
    }

    public static void main(String args[])
    {
        boolean result;

/*        MyIntPredicates mip = new MyIntPredicates();
        boolean result = mip.isPrime(113);
        //System.out.println(mip.isPrime(113));
        //System.out.println(result);
        if (result) System.out.println("113 is prime");

        IntPredicate ipExample = new IntPredicate() {
            @Override
            public boolean test(int n) {
                return false;
            }
        };

        IntPredicate ip = (n) -> {

            if(n < 2) return false;

            for(int i=2; i < n; i++) {
                if((n % i) == 0)
                    return false;
            }
            return true;
        };
        ip.test(7);
        boolean one = ip.test(7);
        System.out.println(one);*/

        IntPredicate ip1 = MyIntPredicates::isPrime; //link method should be static
        //ip1.test(7);
        //boolean bo = ip1.test(7);
        //System.out.println(bo);

        result = numTest(ip1,7);
        if (result) System.out.println("7 is prime");

        // Here, a method reference to isPrime is passed to numTest().
        result = numTest(MyIntPredicates::isPrime, 17); //использование ссылки на статический метод
        if(result) System.out.println("17 is prime.");


        // Next, a method reference to isEven is used.
        result = numTest(MyIntPredicates::isEven, 12); //использование ссылки на статический метод
        if(result) System.out.println("12 is even.");

        // Now, a method reference to isPositive is passed.
        result = numTest(MyIntPredicates::isPositive, 11); //использование ссылки на статический метод
        if(result) System.out.println("11 is positive.");
    }
}
