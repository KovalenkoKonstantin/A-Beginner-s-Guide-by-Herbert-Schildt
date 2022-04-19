package beginners_guide_schildt.chapter8_Interfaces.listing8;

import beginners_guide_schildt.chapter8_Interfaces.listing7.Series;

// Implement Series.
public class ByTwos implements Series {
    int start;
    int val;

    public ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}
