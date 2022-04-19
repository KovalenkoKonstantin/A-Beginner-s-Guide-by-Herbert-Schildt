package beginners_guide_schildt.chapter10_Потоки.listing2;

// Demonstrate System.out.write().
class WriteDemo {
    public static void main(String args[]) {
        int b;

        b = 'X';
        System.out.write(b); //Вывод байтов на экран
        System.out.write('\n');
        System.out.write(5);
        System.out.write('\n');
    }
}