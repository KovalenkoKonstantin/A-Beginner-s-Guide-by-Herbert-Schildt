package chapter9_Exceptions.listing7;

// Subclasses must precede superclasses in catch statements.
class ExcDemo5 {
    public static void main(String args[]) {
        // Here, numer is longer than denom.
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };
        System.out.println("array numer length: " + numer.length);
        System.out.println("array denom length: " + denom.length);

        for(int i=0; i<numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i]/denom[i]);
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // catch the exception
                System.out.println("No matching element found.");
            }
            catch (Throwable exc) {
                System.out.println("Some exception occurred.");
                //В данном случае оператор catch (ThrowaЬle) перехватывает все исключения, кроме
                //ArraylndexOutOfBoundsException.
            }
        }
    }
}
