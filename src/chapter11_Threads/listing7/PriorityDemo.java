package chapter11_Threads.listing7;
class PriorityDemo {
    public static void main(String args[]) {
/**Потоки создаются как экземпляры класса Priority*/
        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low Priority");
        // set the priorities
        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);
        // start the threads
        mt1.thrd.start();
        mt2.thrd.start();
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
/**После остановки обоих потоков выводится число шагов,
 выполненных в каждом цикле*/
        System.out.println("\nHigh priority thread counted to " +
                mt1.count);
        System.out.println("Low priority thread counted to " +
                mt2.count);
    }
}
