package beginners_guide_schildt.chapter5_Операторы;

// Демонстрация использования класса ShowBits
class ShowBitsDemo {
    public static void main(String args[]) {
        ShowBitsv2 b = new ShowBitsv2(8);
        ShowBitsv2 i = new ShowBitsv2(32);
        ShowBitsv2 li = new ShowBitsv2(64);

        System.out.println("123 в двоичном представлении: ");
        b.show(123);

        System.out.println("\n87987 в двоичном представлении: ");
        i.show(87987);

        System.out.println("\n237658768 в двоичном представлении: ");
        li.show(237658768);


        // Можно также отобразить младшие разряды любого целого числа
        System.out.println("\nМладше 8 битов числа 87987 в двоичном представлении: ");
        b.show(87987);
    }
}
