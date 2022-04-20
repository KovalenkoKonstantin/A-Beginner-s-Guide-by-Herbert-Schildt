package chapter3_Инструкции;

// Use commas in a for statememt.
// Применение запятых в операторе цикла for.
class Comma {
    public static void main(String args[]) {
        int i, j;

        for(i=0, j=10; i < j; i++, j--)
            System.out.println("i and j: " + i + " " + j);
        //для управления циклом можно использовать несколько переменных
        //Всякий раз, когда цикл повторяется, переменная i инкрементируется,
        //а переменная j декрементируется.
    }
}