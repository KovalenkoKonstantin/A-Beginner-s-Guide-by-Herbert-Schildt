package beginners_guide_schildt.chapter14_Lambda.listing4;

class BlockLambdaDemo {
    public static void main(String args[])
    {
        // This block lambda returns the smallest positive factor of a value.
        NumericFunc smallestF = (n) ->  {
            int result = 1; //объявляется переменная result

            // Get absolute value of n.
            /**тернарный оператор*/
            n =  n < 0 ? -n : n;

            for(int i=2; i <= n/i; i++) //используется цикл for
                if((n % i) ==0) {
                    result = i;
                    break;
                }

            return result; //осуществляется возврат по инструкции return
        };

        System.out.println("Smallest factor of 12 is " + smallestF.func(-5));
        System.out.println("Smallest factor of 11 is " + smallestF.func(11));
    }
}
