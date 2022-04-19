package beginners_guide_schildt.chapter3_Инструкции;

// Using break with nested loops.
// Применение оператора break во вложенных циклах
class Break3 {
    public static void main(String args[]) {

        for(int i=0; i<3; i++) {
            System.out.println("Счетчик внешнего цикла: " + i);
            System.out.print("    Счетчик внутреннего цикла: ");

            int t = 0;
            while(t < 100) {
                if(t == 10) break; // прервать цикл, если t = 10
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
