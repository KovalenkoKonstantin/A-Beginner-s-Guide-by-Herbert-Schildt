package beginners_guide_schildt.chapter14_Lambda.tasks;

import beginners_guide_schildt.self_annotations.Constructor;
import beginners_guide_schildt.self_annotations.Getter;

public class Factorial {
    private int n;

    @Constructor
    public Factorial(int n) {
        this.n = n;
    }

    @Getter
    public int getN() {
        return n;
    }

    public int factorial(int n) {
        this.n = n;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
