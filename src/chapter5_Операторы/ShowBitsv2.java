package chapter5_Операторы;

//Создание класса для отображения значений в двоичном виде
public class ShowBitsv2 {
    int numbits;

    ShowBitsv2(int n) { //Конструктор класса ShowBits позволяет создавать объекты, отображающие заданное число битов.
        numbits = n; //Число битов, которые должны отображаться, сохраняется в переменной экземпляра numbits.
    }

    void show(long val) { //Для вывода двоичных значений в классе ShowBits определен метод show ()
        long mask = 1;

        // Сдвинуть значение 1 влево на нужную позицию
        mask <<= numbits-1;

        int spacer = 0;
        for(; mask != 0; mask >>>= 1) {
            if((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
