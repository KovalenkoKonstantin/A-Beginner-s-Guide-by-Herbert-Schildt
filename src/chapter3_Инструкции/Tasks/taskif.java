package chapter3_Инструкции.Tasks;

public class taskif {
    public static void main(String[] args) {
        int x = 5 , y = 20, z;
        boolean done = true;

        z = x + y;

        if (x < 10)
            if (y > 100) {
                if (!done) x = z;
            }
            else System.out.println("error");
        System.out.println("else operator belongs to the second operator if");
    }
}
