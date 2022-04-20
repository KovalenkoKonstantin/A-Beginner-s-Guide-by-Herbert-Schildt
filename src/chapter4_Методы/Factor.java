package chapter4_Методы;

class Factor {
    boolean isFactor(int a, int b) {
        if( (b % a) == 0) return true;//Этот метод имеет два параметра
        // При использовании нескольких параметров для каждого из них определяется тип,
        //причем типы параметров могут отличаться.
        else return false;
    }
}
