package chapter4_Методы;
// A simple beginners_guide_schildt that uses a parameter.

class ChkNum {
    // return true if x is even (если х четно)
    boolean isEven (int x){
        if ((x % 2) == 0) return true;//Здесьх-целочисленный параметр метода isEven()
        else return false;
    }
}
