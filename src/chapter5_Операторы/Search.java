package chapter5_Операторы;

// Поиск в массиве с использованием расширенного цикла for.
class Search {
    public static void main(String args[]){

        int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 1;
        boolean found = false;

        // Использовать цикл for-each для поиска значения переменной val в массиве nums.
        for(int x : nums) { //fоr(тип итр_пер : коллекция) блок_операторов
            if(x == val) {
                found = true;
                val = x;
                break;
            }
        }

        if(found)//выводится на печать только если значение found = true
            System.out.println("Значение найдено!\nИ оно равно: " + val);
            else System.out.println("Указанное заначение не найдено");
    }
}
