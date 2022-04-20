package chapter9_Exceptions.listing4;

// This won't work!
class ExcTypeMismatch {
    public static void main(String args[]) {
        int nums[] = new int[4];

        try {
            System.out.println("Before exception is generated.");

            // generate an index out-of-bounds exception
            nums[7] = 10;
            System.out.println("this won't be displayed");
        }

    /* Can't catch an array boundary error with an
       ArithmeticException. */
        catch (ArithmeticException ArEx) {
            // catch the exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
