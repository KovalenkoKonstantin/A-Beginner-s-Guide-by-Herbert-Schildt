package chapter11_Threads.listing12;
class Suspend {
    public static void main(String args[]) {
        MyThread ob1 = new MyThread("Мой пиздюк");

        try {
            Thread.sleep(1000); // let ob1 thread start executing

            ob1.mysuspend();
            System.out.println("Приостановленный пиздюк.");
            Thread.sleep(100);

            ob1.myresume();
            System.out.println("Восстановленный пиздюк.");
            Thread.sleep(5000);


            ob1.mysuspend();
            System.out.println("Приостановленный пиздюк.");
            Thread.sleep(10);

            ob1.myresume();
            System.out.println("Восстановленный пиздюк.");
            Thread.sleep(8000);

            ob1.mysuspend();
            System.out.println("Остановленный пиздюк.");
            ob1.mystop();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        // wait for thread to finish
        try {
            ob1.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Усё.");
    }
}
