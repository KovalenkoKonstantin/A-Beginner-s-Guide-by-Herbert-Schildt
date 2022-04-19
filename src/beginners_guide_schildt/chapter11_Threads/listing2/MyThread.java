package beginners_guide_schildt.chapter11_Threads.listing2;
// Improved MyThread.
class MyThread implements Runnable {
    Thread thrd; //В этой переменной хранится ссылка на поток
    // Construct a new thread.
    MyThread(String name) {
        thrd = new Thread(this, name); //Имя присваивается потоку при eгo создании
        thrd.start(); // start the thread
    }
    // Begin execution of new thread.
    public void run() {
        System.out.println(thrd.getName() + " is starting.");
        try {
            for(int count=0; count<3; count++) {
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
