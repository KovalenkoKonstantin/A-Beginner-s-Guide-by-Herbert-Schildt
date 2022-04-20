package chapter9_Exceptions.listing10;

class RethrowDemo {
    public static void main(String args[]) {
        try {
            Rethrow.genException();
        }
        catch(ArrayIndexOutOfBoundsException noMatterWhatItCalled) {
            // recatch exception
            System.out.println("Fatal error -- " +
                    "program terminated.");
        }
    }
}