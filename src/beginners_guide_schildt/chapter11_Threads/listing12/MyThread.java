package beginners_guide_schildt.chapter11_Threads.listing12;
// Suspending, resuming, and stopping a thread.

class MyThread implements Runnable {
    Thread thrd;
    boolean suspended;
    boolean stopped;

    MyThread(String name) {
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    // This is the entry point for thread.
    public void run() {
        System.out.println(thrd.getName() + " начался.");
        try {
            for(int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if((i%10)==0) {
                    System.out.println();
                    Thread.sleep(4000); //шоб успеть запихнуть цифирки в поток
                }

                // Use synchronized block to check suspended and stopped.
/**Если эта переменная принимает значение true,
 вызывается метод wait (), приостанавливающий выполнение потока*/
                synchronized(this) {
                    while(suspended) {
                        wait();
                    }
                    if(stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " закончился.");
    }

    // Stop the thread.
    synchronized void mystop() {
        stopped = true;

        // The following ensures that a suspended thread can be stopped.
        // Следующие операторы обеспечивают полную остановку приостановленного потока
        suspended = false;
/**вызывается метод notify (). Это необходимо для прекращения работы потока,
 * исполнение которого ранее было приостановлено*/
        notify();
    }

    // Suspend the thread.
/**Значение true присваивается переменной suspended в методе mysuspend () , и поэтому данный метод
 следует вызвать для приостановки потока.*/
    synchronized void mysuspend() {
        suspended = true;
    }

    // Resume the thread.
/**Для возобновления потока служит метод myresume (), в котором переменной suspended
 *  присваивается значение false и вызывается метод notify ().*/
    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
