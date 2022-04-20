package chapter8_Interfaces.listing7;

public interface Series {
    int getNext(); // return next number in series

// Возвратить массив, который содержит n элементов,
// располагающихся в ряду вслед за текущим элементом
    default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for(int i=0; i < n; i++)
            vals[i] = getNext();
        return vals;
    }

    void reset(); // restart
    void setStart(int x); // set starting value
}
