package chapter5_Операторы;

// Использование разновидности for-each цикла for.
class ForEach {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // Use for-each style for to display and sum the values.
        for(int x : nums) { //fоr(тип итр_пер : коллекция) блок_операторов
            System.out.println("Value is: " + x);
            sum += x;
            //sum = sum + x;
        }
        System.out.println("Summation: " + sum);
        System.out.println();

        for (int x : nums) {
            System.out.println("Значение: " + x);
            sum += x;
            if (x == 5) break; // прервать цикл по достижении значения 5
        }
    }
}
