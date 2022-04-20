package chapter9_Exceptions.listing9;

// Manually throw an exception.
class ThrowDemo {
    public static void main(String args[]) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException();
            /**исключение ArithmeticException генерируется с помощью
            ключевого слова new в операторе throw*/
        }
        catch (ArithmeticException ArEx) {
            // catch the exception
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }
}
