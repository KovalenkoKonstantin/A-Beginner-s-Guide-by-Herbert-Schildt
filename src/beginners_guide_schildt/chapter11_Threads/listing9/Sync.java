package beginners_guide_schildt.chapter11_Threads.listing9;
class Sync {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread mt1 = new MyThread("Алёнкин поток", a); //поток запускается при eгo создании
        MyThread mt2 = new MyThread("Семёнов поток", a); //поток запускается при eгo создании

        try {
            mt1.thrd.join(); //ожидание до тех пор пока указанный метод не завершится
            mt2.thrd.join(); //ожидание до тех пор пока указанный метод не завершится
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
