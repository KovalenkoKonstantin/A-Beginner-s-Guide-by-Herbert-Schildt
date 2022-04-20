package chapter11_Threads.listing10;
class ThreadCom {
    public static void main(String args[]) {
/**создается объект tt типа TickTockBad,
 * используемый для запуска двух потоков на исполнение*/
        TickTock tt = new TickTock();
        MyThread mt1 = new MyThread("Tick", tt); //поток запускается при eгo создании
        MyThread mt2 = new MyThread("Tock", tt); //поток запускается при eгo создании

/*        try {
            mt1.thrd.join(); //ожидание до тех пор пока указанный метод не завершится
            mt2.thrd.join(); //ожидание до тех пор пока указанный метод не завершится
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }*/
    }
}
