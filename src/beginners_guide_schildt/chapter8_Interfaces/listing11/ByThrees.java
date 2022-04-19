package beginners_guide_schildt.chapter8_Interfaces.listing11;

import beginners_guide_schildt.chapter8_Interfaces.listing7.Series;

// Implement Series.
    class ByThrees implements Series { //Другой способ реализации интерфейса Series
    int start;
    int val;

    ByThrees() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}