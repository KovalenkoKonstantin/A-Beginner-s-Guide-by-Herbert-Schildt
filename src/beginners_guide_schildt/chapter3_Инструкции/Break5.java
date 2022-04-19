package beginners_guide_schildt.chapter3_Инструкции;

// Еще один пример применения оператора break с меткой
class Break5 {
    public static void main(String args[]) {

        done:
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    System.out.println(k);
                    if(k == 5) break done; // переход по метке done
                }
                System.out.println("После цикла по k"); // won't execute
            }
            System.out.println("После цикла по j"); // won't execute
        }
        System.out.println("После цикла по i");
    }
}
