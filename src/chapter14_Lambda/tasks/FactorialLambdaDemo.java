package chapter14_Lambda.tasks;

import chapter14_Lambda.listing4.NumericFunc;

public class FactorialLambdaDemo {
    public static void main(String args[])
    {

        // This block lambda computes the factorial of an int value.
        NumericFunc factorial = (n) ->  {
            int result = 1;

            for(int i=1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("The factorial of 3 is " + factorial.func(3));
        System.out.println("The factorial of 5 is " + factorial.func(5));
        System.out.println("The factorial of 9 is " + factorial.func(9));
    }
}
