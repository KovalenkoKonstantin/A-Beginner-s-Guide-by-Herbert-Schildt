package beginners_guide_schildt.chapter5_Операторы;

//Циклы for-each предназначены только для чтения.
class NoChange {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for(int x : nums) { //fоr(тип итр_пер : коллекция) блок_операторов
            System.out.print(x + " ");
            x = x * 10; // Эта операция не изменяет содержнмое массива nums
        }

        System.out.println();

        for(int x : nums)
            System.out.print(x + " ");

        System.out.println();
    }
}