package beginners_guide_schildt.chapter3_Инструкции.Tasks;

public class messagebreak {
    public static void main(String[] args) {

        int x = 1, y = 10;
        boolean running = true;

        for (int i = 0; i < 10; i ++){
            while (running){
                if (x < y)break;
            }
            System.out.println("После while " + i);
        }
        System.out.println("После for");
    }
}
