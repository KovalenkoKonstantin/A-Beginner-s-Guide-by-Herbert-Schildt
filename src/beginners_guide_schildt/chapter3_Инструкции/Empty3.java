package beginners_guide_schildt.chapter3_Инструкции;

// The body of a loop can be empty.
// Тело цикла for может быть пустым.
class Empty3 {
    public static void main(String args[]) {
        int i;
        int sum = 0;

        // sum the numbers through 5
        for(i = 1; i <= 5; sum += i++) ;
        //Приведенный выше оператор означает буквально следующее: сложить со
        //значением переменной sum результат суммирования значений переменных sum и i, а затем
        //инкрементировать значение переменной i
        //равнозначен sum = sum + i; i++;
        //В цикле отсутстаует тело

        System.out.println("Sum is: " + sum);
    }
}
