package chapter11_Threads.listing4;
class MoreThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        MyThread mt1 = new MyThread("John's thread");
        MyThread mt2 = new MyThread("Larry's thread");
        MyThread mt3 = new MyThread("Mike's thread");
        for(int i=0; i < 10; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
