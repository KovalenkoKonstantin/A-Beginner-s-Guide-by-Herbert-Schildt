package beginners_guide_schildt.chapter14_Lambda.listing9;
// This class defines three static methods that check an integer
// against some condition.
class MyIntPredicates {
    /** A static method that returns true if a number is prime/простое.*/
    static boolean isPrime(int n) {

        if(n < 2) return false;

        for(int i=2; i < n; i++) {
            if((n % i) == 0)
                return false;
        }
        return true;
    }

    /** A static method that returns true if a number is even/чётное.*/
    static boolean isEven(int n) {
        return (n % 2) == 0;
    }

    /** A static method that returns true if a number is positive.*/
    static boolean isPositive(int n) {
        return n > 0;
    }
}
