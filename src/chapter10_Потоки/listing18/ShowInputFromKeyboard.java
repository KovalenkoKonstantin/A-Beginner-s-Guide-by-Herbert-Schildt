package chapter10_Потоки.listing18;

import java.util.*;

public class ShowInputFromKeyboard {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter values: ");
        int i;

        if (x.hasNextInt()) {
            i = x.nextInt();
        System.out.println(i);
        }else System.out.println("Хьюстон у нас проблемы - какая-то херня была введена.\nAbort mission.");
    }
}
