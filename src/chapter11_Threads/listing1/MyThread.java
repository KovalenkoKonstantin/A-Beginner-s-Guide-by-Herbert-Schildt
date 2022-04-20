package chapter11_Threads.listing1;

// Create a thread by implementing Runnable.

class MyThread implements Runnable {
/**Объекты типа MyThread могут выполняться в отдельных потоках,
 * так как класс MyThread реализует интерфейс Runnable*/
    String thrdName;

    MyThread(String name) {
        thrdName = name;
    }

    // Entry point of thread.
    public void run() { //Отсюда начинают выполняться потоки
        System.out.println(thrdName + " starting.");
        try {
            for(int count=0; count < 5; count++) {
/** метод sleep() приостанавливает поток, из которого он был вызван,
 * на указанное число миллисекунд. throws InterruptedException*/
                Thread.sleep(300);
                System.out.println("In " + thrdName +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
}
