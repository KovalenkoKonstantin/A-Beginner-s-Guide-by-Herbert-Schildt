package chapter14_Lambda.listing1;

class LambdaDemo {
    static double myMeth () {return 98.6;}
    public static void main(String args[])
    {
        System.out.println(myMeth());

        MyValue myVal;  // declare an interface reference

        // Here, the lambda expression is simply a constant expression.
        // When it is assigned to myVal, a class instance is
        // constructed in which the lambda expression implements
        // the getValue() method in MyValue.
        myVal = ()-> 98.6;
        System.out.println(myVal);
        // Call getValue(), which is provided by the previously assigned
        // lambda expression.
        System.out.println("A constant value: " + myVal.getValue());

        // Now, create a parameterized lambda expression and assign it to
        // a MyParamValue reference. This lambda expression returns
        // the reciprocal of its argument.
        MyParamValue myPval = (double n) -> 1.0 / n;
        MyParamValue x = (n) -> n;

        // Call getValue(v) through the myPval reference.
        System.out.println("Reciprocal (обратный) of 4 is " + myPval.getValue(4.0));
        System.out.println("Reciprocal (обратный) of 8 is " + myPval.getValue(8.0));
        System.out.println(x.getValue(88.0));

        // A lambda expression must be compatible with the method
        // defined by the functional interface. Therefore, these won't work:
        //  myVal = () -> "three"; // Error! String not compatible with double!
        //  myPval = () -> Math.random(); // Error! Parameter required!
        MyParamValue y = n -> Math.random() + n;
        System.out.println(y.getValue(100));
    }
}
