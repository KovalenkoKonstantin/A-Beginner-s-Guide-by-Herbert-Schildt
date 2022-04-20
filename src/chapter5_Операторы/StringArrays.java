package chapter5_Операторы;

// Демонстрация использования массивов строк.
class StringArrays {
    public static void main(String args[]) {
        String strs[] = { "This", "is", "a", "test." };

        System.out.println("Original array: ");
        for(String s : strs) //fоr(тип итр_пер : коллекция) блок_операторов
            System.out.print(s + " ");
        System.out.println("\n");

        // Изменить строку
        strs[1] = "was";
        strs[3] = "test, too!";

        System.out.println("Изменённый массив: ");
        for(String s : strs) //fоr(тип итр_пер : коллекция) блок_операторов
            System.out.print(s + " ");
        System.out.println();
    }
}