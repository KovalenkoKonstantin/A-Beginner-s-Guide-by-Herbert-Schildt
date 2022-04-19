package beginners_guide_schildt.chapter4_Методы;
/*класс Pwr, предназначен для вычисления
        целочисленной степени заданного числа*/
class Pwr {
    double b;
    int e;
    double sum;

    Pwr(double база, int экспонента) {
        b = база;
        e = экспонента;

        sum = 1;
        if(экспонента == 0) return;//оператор return при достижении истинности выражения if
        // завершает выполнение конструктора Pwr
        for( ; экспонента > 0; экспонента--) sum = sum * база;
    }

    double get_pwr() {
        return sum;//оператор return возвращает значение переменной sum
    }
}