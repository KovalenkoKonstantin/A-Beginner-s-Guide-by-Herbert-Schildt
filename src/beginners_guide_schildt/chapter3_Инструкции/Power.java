package beginners_guide_schildt.chapter3_Инструкции;

// Compute integer powers of 2.
// Вычисление целых степеней числа 2 (до10).
class Power {
    public static void main(String args[]) {
        int e;
        int result;

        for(int i=0; i < 10; i++) {
            result = 1;//переменная i инициализиурется в цикле for
            e = i;
            //цикл while выполняется только в том случае, если
            //значение переменной е больше нуля. А когда оно равно нулю, как это имеет место на
            //первом шаге цикла for, цикл while пропускается
            while(e > 0) {
                result *= 2;//result = result * 2
                e--;//для того чтобы завершить цикл while e декрементируется
            }

            System.out.println("2 в степени " + i +
                    " равно " + result);
            //пример не доработан на 31 степени происходит ошибка сваливающаяся в отрицательные значения
        }
    }
}
