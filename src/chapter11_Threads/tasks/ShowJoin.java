package chapter11_Threads.tasks;

import chapter11_Threads.listing6.MyThread;
/**Покажите, как с помощью метода join () можно организовать ожидание завершения
 потокового объекта MyThrd.*/
public class ShowJoin {
    public static void main(String[] args) {
        MyThread MyThrd = new MyThread("Линия пульса");
        try {
            MyThrd.thrd.join();
            System.out.println("+1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThread MyThrd2 = new MyThread("Линия метро");
        try {
            MyThrd2.thrd.join();
            System.out.println("+2");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
