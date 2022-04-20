package chapter11_Threads.listing4;
// Create multiple threads.
public class MyThread implements Runnable {
    public Thread thrd;
    // Construct a new thread.
    public MyThread(String name) {
        thrd = new Thread(this, name);
        thrd.start(); // start the thread
    }
    // Begin execution of new thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int count=0; count < 3; count++) {
                Thread.sleep(200);
                System.out.println("In " + thrd.getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}
