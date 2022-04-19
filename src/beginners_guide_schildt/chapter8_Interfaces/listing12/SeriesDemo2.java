package beginners_guide_schildt.chapter8_Interfaces.listing12;

import beginners_guide_schildt.chapter8_Interfaces.listing7.*;

class SeriesDemo2 {
    public static void main(String args[]) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob; //переменная оЬ объявляется как ссылка на интерфейс Series
//Это означает, что в данной переменной может храниться ссылка на любой объект, реализующий
//интерфейс Series.
//В данном случае в переменной оЬ сохраняется ссылка на
//объекты twoOb и threeOb, т.е. в разные моменты времени переменная представляет собой
//ссылку на объект класса ByTwos или же на объект класса ByThrees.

        for(int i=0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Next ByTwos value is " +
                    ob.getNext());
            ob = threeOb;
            System.out.println("Next ByThrees value is " +
                    ob.getNext());
            System.out.println();
        }
    }
}

