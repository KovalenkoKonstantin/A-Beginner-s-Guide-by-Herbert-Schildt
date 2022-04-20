package chapter14_Lambda.listing11;
// This class stores an int value and defines the instance
// method isFactor(), which returns true if its argument
// is a factor/делитель of the stored value.
class MyIntNum {
    private int v, t;

    MyIntNum(int x) { v = x; }

    int getNum() { return v; }

    // Return true if n is a factor of v.
    boolean isFactor(int n) {
        t = n;
        return (v % n) == 0;
    }
    int getFactor(){return t;}
}
