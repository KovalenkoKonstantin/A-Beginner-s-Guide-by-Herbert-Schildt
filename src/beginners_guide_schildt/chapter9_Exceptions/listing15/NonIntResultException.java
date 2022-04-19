package beginners_guide_schildt.chapter9_Exceptions.listing15;

// Use a custom exception.

// Create an exception.
class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }
    @Override /**from Throwable and that from Object*/
    public String toString() {
        return "Result of " + n + " divide " + d + " equals = " + (double)n/d +
                " that is non-integer.";
    }
}