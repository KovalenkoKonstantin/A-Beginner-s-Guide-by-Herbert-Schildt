package beginners_guide_schildt.chapter5_Операторы;

// Демонстрация использования операций '<<' и '>>' сдвига влево и вправо.
class ShiftDemo {
    public static void main(String args[]) {
        int x = 1; //1 dec = 0000 0001 bin

        for(int i = 0; i < 8; i++) {
            System.out.print( i + "i\t");
            //отобразить десятичное число в двоичном формате
            for(int t=128; t > 0; t /= 2) {
                //128 dec = 1000 0000 bin
                //128/2=64/2=32/2=16/2=8/2=4/2=2/2=1 0xd00001 1&1=1
                if((x & t) != 0) System.out.print("'1' " + t + "t"+ x + "x");
                //0000 0001 - x=1
                //&
                //0000 0001 - t=1
                    //0000 0100 - x=4
                    //&
                    //0000 0100 - t=4
                       //1000 0000 - x=128
                       //&
                       //1000 0000 - t=128
                else System.out.print("'0' "+ t +"t"+ x +"x\t");
            }
            System.out.println();
            x <<= 1; //сдвинуть влево
            // по окончание каждого цикла x сдвигается влево
            // было 0000 0001 - стало 0000 0010
        }
        System.out.println();
        x = 128; //128 dec = 1000 0000 bin
        for(int i = 0; i < 8; i++) {
            System.out.print( i + "i\t");
            for(int t=128; t > 0; t /= 2) {
                //1000 0000 - 128
                //
                if((x & t) != 0) System.out.print("'1' "+ t +"t"+ x +"x");
                else System.out.print("'0' "+ t +"t"+ x +"x\t");
            }
            System.out.println();
            x >>= 1; // сдвинуть вправо
            // по окончание каждого цикла x сдвигается влево
            // было 1000 0001 - стало 0100 0000
        }
    }
}
