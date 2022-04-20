package chapter11_Threads.listing8;

class Sync {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread mt1 = new MyThread("John's tread", a); //поток запускается при eгo создании
        MyThread mt2 = new MyThread("Kris's tread", a); //поток запускается при eгo создании

        try {
            mt1.thrd.join(); //ожидание до тех пор пока указанный метод не завершится
            mt2.thrd.join(); //ожидание до тех пор пока указанный метод не завершится
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }

    }
}
