package chapter5_Операторы.Tasks;

public class Avg {
    public static void main(String[] args) {
//        double array1 [] = new double[12];
//        double array2 [];
//        array2 = new double[12];
//        int array3 [] = {1, 2, 3, 4, 5};
        double array4 [] = {1.1,2.2,5.8,9,10,15.5,99,77,199.55,256};
        double sum = 0;
        double sum1 =0;

        System.out.println("Начальный массив: ");
        for (int x = 0; x < array4.length; x++)
            System.out.print(array4[x] + "\t\t");
        System.out.println();

        System.out.println("Сумма значений массива равна: ");
        for (double i: array4){
            sum += i;
        }
        System.out.println(sum);
        System.out.println("Длина массива составляет: \n"+ array4.length + " переменных");
        System.out.println("Среднее арифметическое значений массива составляет: \n" + sum/array4.length);

        System.out.println("Или: ");
        for (int y = 0; y < array4.length; y++)
            sum1 += array4[y];
        System.out.println(sum1/array4.length);
    }
}
