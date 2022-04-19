package beginners_guide_schildt.chapter14_Lambda.listing7;

class VarCapture {
    public static void main(String args[])
    {
        // A local variable that can be captured.
        //can be defined as final
        //final int num = 10;
        //behave as final
        int num = 10;

        MyFunc myLambda = (n) ->  {
            // This use of num is OK. It does not modify num.
            int v = num + n;

            // However, the following is illegal because it attempts
            // to modify the value of num.
            //    num++;
            return v;
        };

        // Use the lambda. This will display 18.
        System.out.println("return (int v) = (final int num + n = (10 + (n = 8))) = " + myLambda.func(8));
        System.out.println(myLambda.basic(8));
        // The following line would also cause an error, because
        // it would remove the effectively final status from num.
        //  num = 9;
    }
}
