package beginners_guide_schildt.chapter1_Основы;
/* This program displays a conversion
   table of gallons to liters.*/
class GalToLitTable {
    public static void main(String args[]) {
        double gallons, liters;
        int counter;
        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // convert to liters
            System.out.println(gallons + " gallons is " +
                    liters + " liters.");
            counter++;
            // every 10th line, print a blank line
            if(counter == 10) {
                System.out.println();//вывод пустой строки
                counter = 0; //после вывода пустой строки reset the line counter
            }
        }
    }
}
/*Таблица 1.1. Ключевые слова Java
abstract assert boolean break byte case
catch char class const continue default
do douЫe else enum extends final
finally float for goto if implements
import instanceof int interface long native
new package private protected puЫic return
short static strictfp super switch synchronized
this throw throws transient try void volatile while
Ключевые слова нельзя использовать в качестве имен переменных, классов или методов.*/
