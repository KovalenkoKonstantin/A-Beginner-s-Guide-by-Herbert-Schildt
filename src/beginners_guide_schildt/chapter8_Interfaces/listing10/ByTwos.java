package beginners_guide_schildt.chapter8_Interfaces.listing10;

import beginners_guide_schildt.chapter8_Interfaces.listing7.Series;

// Implement Series and add getPrevious().
class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos() {
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
        prev = start-2;
    }

    public void setStart(int x) {
        start = x;
        val = x;
        prev = x - 2;
    }

    int getPrevious() { //Добавление метода, не объявленного в интерфейсе Series
        return prev;
    }
}
