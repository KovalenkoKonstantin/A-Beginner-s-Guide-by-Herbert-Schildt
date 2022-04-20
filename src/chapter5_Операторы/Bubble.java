package chapter5_Операторы;

// Пример реализации алгоритма пузырьковой сортировки

class Bubble {
    public static void main(String args[]) {
        int nums[] = { 99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49 };
        int a, b, t, i;
        int size = 10;// number of elements to sort
        // display original array
        System.out.print("Original array is:");
        for(i=0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        //Пример реализации алгоритма пузырьковой сортировки
        for(a=1; a < size; a++)//перебирать все а с 1 до 10
            for(b = size -1; b >= a; b--) { //перебирать все b с 9 до тех пор пока b не станет меньше а
                if(nums[b-1] > nums[b]) { //если предшествующая позиция больше последующей
                    //if true и выполняется выражение {}
                    //если требуемый порядок следования не соблюдается, поменять элементы местами
                    t = nums[b-1];//вводится элемент t которому присваивается значение элемента массива b-1
                    nums[b-1] = nums[b];//значение элемента b-1 массива присваивается значению b
                    nums[b] = t;//значение элемента массива b-1 присваивается элементу b массива
                }
            }

        // display sorted array
        System.out.print("Sorted array is:");
        for(i=0; i < size; i++)//исключает ошибку ArrayIndexOutOfBoundsException
            // отбрасывая значения за пределами массива
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}
