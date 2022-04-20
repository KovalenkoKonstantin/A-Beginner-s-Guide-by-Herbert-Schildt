package chapter5_Операторы;

//Use the length array member.
//Использование переменной экземпляра length
class LengthDemo {
    public static void main(String args[]) {
        int list[] = new int[11];
        int nums[] = { 1, 2, 3 };
        int table[] [] = { // a variable-length table таблица со строками переменной длины
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
                {1, 7, 8, 9, 13, 15, 22},
                {5, 777,},
                {100}
        };
        System.out.println("Зармер списка: " + list.length);//Использование переменной экземпляра length
        System.out.println("Зармер nums: " + nums.length);//вичисляет колличетсво сиволов содержащихся в массиве
        System.out.println("Размер table: " + table.length);//вичисляет колличетсво массивов содержащихся в массиве
        System.out.println("Размер table[0]: " + table[0].length);//вычисляет колличество символов сожержащихся в массиве
        System.out.println("Размер table[1]: " + table[1].length);
        System.out.println("Размер table[3]: " + table[3].length);
        System.out.println();

        // Использовать переменную length для инициализации списка
        for(int i=0; i < list.length; i++)//до тех пор пока не превысит значение 11
            list[i] = i * i;//Использование переменной length дnя управления циклом for

        System.out.print("Here is list: ");
        // now use length to display list
        for(int i=0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}