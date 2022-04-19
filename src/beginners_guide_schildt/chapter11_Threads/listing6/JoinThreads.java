package beginners_guide_schildt.chapter11_Threads.listing6;
class JoinThreads {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        MyThread mt1 = new MyThread("John's thread");
        MyThread mt2 = new MyThread("Larry's thread");
        MyThread mt3 = new MyThread("Mike's thread");
        try {
            mt1.thrd.join(); //ожидание до тех пор пока указанный метод не завершится
            System.out.println("John's child is joined.");
            mt2.thrd.join();//ожидание до тех пор пока указанный метод не завершится
            System.out.println("Larry's child is joined.");
            mt3.thrd.join();//ожидание до тех пор пока указанный метод не завершится
            System.out.println("Mike's child is joined.");
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
    }
}
