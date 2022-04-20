package chapter3_Инструкции;

// A negatively running for loop.
// Цикл for, выполняющийся с отрицательным приращением переменной.
class DecrFor {
    public static void main(String args[]) {
        int x;

        for(x = 50; x > -50; x -= 10)
            System.out.println(x);
        //на каждом шаге переменная цикла уменьшается на 10.
    }
}
