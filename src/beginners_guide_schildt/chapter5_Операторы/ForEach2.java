package beginners_guide_schildt.chapter5_Операторы;

// Использование расширенного цикла for для обработки двумерного массива
class ForEach2 {
    public static void main(String args[]) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // Ввести ряд значений в массив values
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);

        // Использовать разновидность for-each цикла for для суммирования и отображения значений.
        // Обратить внимание на объявление переменной х.
        //fоr(тип итр_пер : коллекция) блок_операторов
        for (int x[] : nums) { //переменная х представляет собой ссылку на одномерный целочисленный массив
            for (int y : x) {
                System.out.println("Значение: " + y);
                sum += y;//инкрементирование каждой позиции на величину y
                //sum = sum + y;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
