package beginners_guide_schildt.chapter11_Threads.listing3;
/*   Try This 11-1
   Extend Thread.*/
class MyThread extends Thread {
    // Construct a new thread.
    MyThread(String name) {
        super(name); // name thread
/**в данном конструкторе присутствует ключевое слово super, которое
 используется для вызова следующего варианта конструктора Thread:
 Thread {String имя);*/
        start(); // start the thread
    }
    // Begin execution of new thread.
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count < 3; count++) {
                Thread.sleep(200);
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}
