package beginners_guide_schildt.chapter14_Lambda.listing4;
import beginners_guide_schildt.self_annotations.*;

public class Func {
    private int n, t;
@Constructor
    public Func(int n) {
        this.n = n;
    }
@Getter
    public int getN() {
        return n;
    }

    public int smallestFactor(int n){
        this.t = n;
        int result = 1;

        n = n < 0 ? -n : n;

        for(int i=2; i <= n/i; i++)
            if((n % i) ==0) {
                result = i;
                break;
            }
        return result;
    }
}
