package beginners_guide_schildt.chapter11_Threads.listing5;
import beginners_guide_schildt.chapter11_Threads.listing4.MyThread;
// Use isAlive().
class MoreThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        MyThread mt1 = new MyThread("John's thread");
        MyThread mt2 = new MyThread("Larry's thread");
        MyThread mt3 = new MyThread("Mike's thread");
        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        } while (mt1.thrd.isAlive() ||
                mt2.thrd.isAlive() || //Ожидание эавершения всех потоков
                mt3.thrd.isAlive());
        System.out.println("Main thread ending.");
    }
}
