package beginners_guide_schildt.chapter11_Threads.tasks;

public class WatchThread implements Runnable {
    Thread thd;
    TickTockv2 watchob;
    int a, i;

    WatchThread(String name, TickTockv2 tt, int number_of_times) {
        thd = new Thread(this, name);
        watchob = tt;
        thd.start();
        a = number_of_times;
    }

    @Override
    public void run() {
        if (thd.getName().equals("Ап")) {
            for (i = 0; i < a; i++) watchob.tick(true);
            watchob.tick(false);
        } else {
            for (i = 0; i < a; i++) watchob.tock(true);
            watchob.tock(false);
        }
        System.out.println("Будь здоров");
    }
}
