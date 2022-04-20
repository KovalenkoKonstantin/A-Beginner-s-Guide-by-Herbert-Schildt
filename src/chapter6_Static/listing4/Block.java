package chapter6_Static.listing4;

// Методам можно передавать объекты
class Block {
    int a, b, c;
    int volume = a*b*c;

    Block(int i, int j, int k) { //конструктор
        a = i;
        b = j;
        c = k;
        //volume = a * b * c;
    }

    // Вернуть логическое значение true,
    // если параметр оЬ определяет тот же параллелепипед
    boolean sameBlock(Block ob) { //Использование объектного типа в качестве параметра
        if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        //В методах sameBlock () и sameVolume () объект Block, переданный им в качестве параметра,
        //сравнивается с текущим объектом. Метод sameBlock () возвращает логическое
        //значение true только в том случае, если все три размера обоих параллелепипедов совпадают.
        //В методе же sameVolume () сравниваются лишь объемы двух параллелепипедов.
        //Но в обоих случаях параметр оЬ имеет тип Block. Несмотря на то что Block - это
        //класс, параметры данного типа используются точно так же, как и параметры встроенных
        //в Java типов данных.
        //else return false;
        return false;
    }

    // Return true if ob has same volume.
    boolean sameVolume(Block ob) { //Использование объектного типа в качестве параметра
        if(ob.volume == volume) return true;
        //else return false;
        return false;
    }
}
