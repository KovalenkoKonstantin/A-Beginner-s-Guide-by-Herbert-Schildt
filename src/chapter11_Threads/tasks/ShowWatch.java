package chapter11_Threads.tasks;

public class ShowWatch {
    public static void main(String[] args) {
        TickTockv2 tt = new TickTockv2();
        WatchThread wt = new WatchThread("Ап", tt, 5);
        WatchThread wt2 = new WatchThread("Пчхи", tt,5);
    }
}
