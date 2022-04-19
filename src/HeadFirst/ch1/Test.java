package HeadFirst.ch1;

public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            //y = x - y;//1

            //y = y + x;//2

/*            y = y + 2;//3
            if (y > 4) {
                y--;
            }*/

/*            x++;//4
            y = y + x;*/

            if (y < 5) {//5
                x++;
                if (y < 3) {
                    x--;
                }
            }
            y = y + 2;

            System.out.print(x + "" + y + " ");
            x++;
        }
    }
}
